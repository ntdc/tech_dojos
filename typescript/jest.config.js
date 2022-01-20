"use strict";

module.exports = {
  verbose: true,
  preset: 'ts-jest',
  testEnvironment: 'node',
  testMatch: ["**/__tests__/**/*.ts?(x)", "**/?(*.)+(test).ts?(x)",
   "**/__tests__/**/*.js?(x)", "**/?(*.)+(test).js?(x)"]
};
