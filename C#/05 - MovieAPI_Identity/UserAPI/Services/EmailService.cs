using System;
using UserAPI.Models;

namespace UserAPI.Services
{
    public class EmailService
    {
        //addressee -> destinatário
        //subject -> assunto
        //
        public void SendEmail(string[] addressee, string subject, int userId, string codeActivation)
        {
            Message message = new Message(addressee, subject, userId, codeActivation);
            var messageOfEmail = CreateBodyToEmail(message);
        }

        public object CreateBodyToEmail(Message message)
        {
            throw new NotImplementedException();
        }
    }
}
