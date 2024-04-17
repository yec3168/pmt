import React, {useEffect, useState} from "react";
import axios from 'axios';
import MainLayout from "./fragments/MainLayout";
import InputSample from "./practice/InputSample";

function App() {
  // const [data, setData] = useState('')

  // useEffect(() => {
  //   axios.get('/api/data')
  //       .then(res => setData(res.data)) //response
  //       .catch(err => console.log(err))
  // }, []);

  return (
      // <MainLayout />
      <InputSample />

  );
}

export default App;
