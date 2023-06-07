import axios from 'axios';
import React, { useState, useEffect } from 'react';

import img1 from './mokoko.webp';

const App = () => {

  const [message,setMessage] = useState([]);
  const [data,setData] = useState([]);

  useEffect(() => {
    fetch('/hello')
    .then(res => { return res.json()})
    .then(function(data){
      setMessage(data);
    });

    axios.get('/list').then(
      res => {
        setData(res.data);
      }
    )  
  }, []);
  
  return (
    <div>
      <header>
        <img src={img1} style = {{width:'200px' }}/>
        <h1>스프링 부트로 /hello부터 받은 데이터 출력</h1>
        <ul style = {{listStyle: 'none'}}>
          {
         message.map((item,index) => <li key = {index}>
            {item}

          
          </li>)
          }


        </ul>
        <hr/>

        <section>
            <h2>스프링 부트로 /list부터 받은 데이터 출력</h2>
            {
              data.map((item,index) => <li key = {index}>
                {item.name} : {item.addr} : {item.age}


              </li>)
            }


        </section>

      </header>
    </div>
  );
};

export default App;