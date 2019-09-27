#!/bin/bash
docker build -t demoapps/sap-ui5-for-flow .
#docker tag demoapps/sap-ui5-for-flow:latest demoapps/sap-ui5-for-flow:20190826-001
#docker push demoapps/sap-ui5-for-flow:20190826-001
docker push demoapps/sap-ui5-for-flow:latest
