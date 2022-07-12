import icon from "../../assets/img/logo-icon.svg"
import "./styles.css"
function Header() {
    return (
        <>
            <header>
                <div className="logo-container">
                    <img src={icon} alt="DSMeta" />
                    <h1>Project Java React</h1> <br />
                    <p id="-pHeader">
                        Desenvolvido por: 
                        <a href="https://www.instagram.com/_fernando_furtado_">@_fernando_furtado_</a>
                    </p>
                </div>
            </header>
        </>
    )
}

export default Header