import React from 'react';
import logo from './logo.svg';
import './App.css';
import Greet from './components/greet'
import Demo from './components/demo'
import Sample from './components/sample'
import Info from './components/info'
import SumComponent from './components/sumComponent'
import Btn from './components/button'
function App() {
  // return (<Greet/>);
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Welcome to React   
        </a>
        <Greet name="Kushaggra" location="Delhi"/>
        <Greet>Hi there</Greet>
        <Info color="green"/>
        <Demo topic='React'/>
        <Sample/>
        <SumComponent num1='20' num2='30'/>
        <Btn val="1"/>
      </header>
    </div>
  );
}

export default App;