import icon from "../../assets/img/vector-notification-icon.svg"
import './styles.css'

function NotificationBotton() {
    return (
        <>
            <div className="red-btn">
                <img src={icon} alt="Notificar" />
            </div>
        </>
    )
}

export default NotificationBotton