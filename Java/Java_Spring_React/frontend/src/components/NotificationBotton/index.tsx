import icon from "../../assets/img/vector-notification-icon.svg"
import './styles.css'
import axios from "axios";
import { BASE_URL } from "../../utils/request";
import { toast } from "react-toastify";


type Props = {
    saleId: number; 
}

//Function actionListener
function handleClick(id : number){
    axios(`${BASE_URL}/sales/${id}/notification`)
    .then(response => {
        toast.info("SMS encaminhado com sucesso!!!")
    })
}

function NotificationBotton({saleId} : Props) {
    return (
        <>
            <div className="red-btn" onClick={() => handleClick(saleId)}>
                <img src={icon} alt="Notificar" />
            </div>
        </>
    )
}

export default NotificationBotton