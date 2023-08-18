

import React, { useState } from "react";
import { Form, Button } from "react-bootstrap";
import { addCustomer } from "../API/customerAPI";

const RegistrationForm = () => {
  const [cust_Name, setName] = useState(" ");
  const [cust_Email, setEmail] = useState(" ");
  const [cust_Pass, setPass] = useState(" ");
  const [cust_contactNo, setcontactNo] = useState(" ");
  const [cust_gender, setgender] = useState(" ");

  const Cust = {
    cust_Name,
    cust_Email,
    cust_Pass,
    cust_contactNo,
    cust_gender,
  };
  const regCustomer = async (e) => {
    e.preventDefault();
    console.log(Cust);
    await addCustomer(Cust);
    console.log(Response.error);
  };

  return (
    <>
      <div class="main">
        <div class="D2"></div>
        <div className="D1">
          <div className="glass">
            <div class="d3">
              <h1 class="sig">Sign up</h1>
              <Form class="form" method="post">
                <Form.Group controlId="Name" class="f1">
                  <Form.Label class="font"> Name</Form.Label>
                  <Form.Control
                    type="text"
                    name="Name"
                    onChange={(e) => {
                      setName(e.target.value);
                    }}
                  />
                </Form.Group>
                <Form.Group controlId="email" class="f1">
                  <Form.Label class="font">Email</Form.Label>
                  <Form.Control
                    type="email"
                    name="email"
                    onChange={(e) => {
                      setEmail(e.target.value);
                    }}
                  />
                </Form.Group>
                <Form.Group controlId="password" class="f1">
                  <Form.Label class="font">Password</Form.Label>
                  <Form.Control
                    type="password"
                    name="password"
                    onChange={(e) => {
                      setPass(e.target.value);
                    }}
                  />
                </Form.Group>
                <Form.Group controlId="Mobile" class="f1">
                  <Form.Label class="font">Mobile No</Form.Label>
                  <Form.Control
                    type="text"
                    name="Mobile"
                    onChange={(e) => {
                      setcontactNo(e.target.value);
                    }}
                  />
                </Form.Group>
                <Form.Group controlId="Gender" class="f1">
                  <Form.Label class="font">Gender</Form.Label>
                  <Form.Control
                    type="text"
                    name="Location"
                    onChange={(e) => {
                      setgender(e.target.value);
                    }}
                  />
                </Form.Group>
                <Button class="btn2" variant="primary" type="back">
                  Back
                </Button>
                <Button
                  class="btn"
                  variant="primary"
                  type="submit"
                  onClick={regCustomer}
                >
                  Register
                </Button>
              </Form>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default RegistrationForm;
