import axios from "axios";

const custAPI = "http://localhost:8080";
export const addCustomer = async (data) => {
  try {
    return await axios.post(`${custAPI}/register`, data);
  } catch (error) {
    console.log("Error", error.message);
  }
};
