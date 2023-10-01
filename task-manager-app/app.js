const express = require('express');
const app = express();
const tasks = require('./routes/tasks');
const connectDB = require('./db/connect');
require('dotenv').config(); // module to work with .env file

const notFound = require('./middleware/not-found');
// using built in custom error handler
const errorHandlerMiddleware = require('./middleware/error-handler');

// middlewares - to work with json format data
app.use(express.json());

app.use(express.static('./public'));

// routes
app.use("/api/v1/tasks", tasks);

const port = process.env.PORT || 3000;

const start = async () => {
    try {
      await connectDB(process.env.MONGO_URI);
      app.listen(port, () =>
        console.log(`Server is listening on port ${port}...`)
      );
    } catch (error) {
      console.log(error.message);
    }
};

// staring connection to mongodb
start();