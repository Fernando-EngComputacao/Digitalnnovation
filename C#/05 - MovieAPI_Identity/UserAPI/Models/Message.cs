using MimeKit;
using System.Collections.Generic;
using System.Linq;

namespace UserAPI.Models
{
    public class Message
    {
        public List<MailboxAddress> Addressee { get; set; }
        public string Subject { get; set; }
        public string Content { get; set; }

        public Message(IEnumerable<string> addressee, string subject, int userId, string activateCode)
        {
            string url = "?UserId={userId}&ActivateCode={activateCode}";
            Content = $"https://localhost:3031/Registration/active" + url;
            Subject = subject;
            Addressee = new List<MailboxAddress>();
            Addressee.AddRange(addressee.Select(d => new MailboxAddress(d))); 
        }

        //Constructor

    }
}
