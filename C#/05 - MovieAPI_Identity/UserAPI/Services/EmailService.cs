using MailKit.Net.Smtp;
using Microsoft.Extensions.Configuration;
using MimeKit;
using System;
using UserAPI.Models;

namespace UserAPI.Services
{
    public class EmailService
    {
        //Atributes
        private IConfiguration _configuration;
        //Constructor
        public EmailService(IConfiguration configuration)
        {
            _configuration = configuration;
        }

        //addressee -> destinatário
        //subject -> assunto
        //
        public void SendEmail(string[] addressee, string subject, int userId, string codeActivation)
        {
            Message message = new Message(addressee, subject, userId, codeActivation);
            var messageOfEmail = CreateBodyToEmail(message);
            Send(messageOfEmail);
        }

        private void Send(MimeMessage messageOfEmail)
        {
            using(var client = new SmtpClient())
            {
                try
                {
                    client.Connect(
                        _configuration.GetValue<string>("EmailSettings:StmpServer"), 
                        _configuration.GetValue<int>("EmailSettings:Port"), true);
                    client.AuthenticationMechanisms.Remove("XOUTH2");
                    client.Authenticate(
                        _configuration.GetValue<string>("EmailSettings:From"),
                        _configuration.GetValue<string>("EmailSettings:Password"));
                    //TO DO Auth de e-mail
                    client.Send(messageOfEmail);
                }
                catch
                {
                    throw;
                }
                finally
                {
                    client.Disconnect(true);
                    client.Dispose();
                }
            }
        }

        public MimeMessage CreateBodyToEmail(Message message)
        {
            var emailMessage = new MimeMessage();
            emailMessage.From.Add(new MailboxAddress(_configuration.GetValue<string>("EmailSettings:From")));
            emailMessage.To.AddRange(message.Addressee);
            emailMessage.Subject = message.Subject;
            emailMessage.Body = new TextPart(MimeKit.Text.TextFormat.Text)
            {
                Text = message.Content
            };

            return emailMessage;
        }
    }
}
