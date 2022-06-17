using System.ComponentModel.DataAnnotations;

namespace UserAPI.Controllers.Requests
{
    public class ActiveAccountRequest
    {
        [Required]
        public int UserId { get; set; }
        [Required]
        public string ActivateCode { get; set; }
    }
}
