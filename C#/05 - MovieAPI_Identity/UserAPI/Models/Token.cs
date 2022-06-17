namespace UserAPI.Models
{
    public class Token
    {
        public string Value { get; }

        //Constructor
        public Token(string value)
        {
            this.Value = value;
        }
    }
}
