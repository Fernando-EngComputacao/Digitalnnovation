import Header from "./components/Header"
import NotificationBotton from "./components/NotificationBotton"
import SalesCard from "./components/SalesCard"

function App() {
  return (
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="-container">
            <SalesCard />
          </div>
        </section>
      </main>
      <NotificationBotton />
        </>
        )
}

        export default App
