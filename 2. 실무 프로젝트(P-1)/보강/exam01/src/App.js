import Buttons from "./components/buttons";

function App() {
  const name = "채도아";

  return (
    <>
      {name && <h1>QWER!!, {name}</h1>}
      <h2>ASDF!!</h2>
      <Buttons />
    </>
  );
}

export default App;
