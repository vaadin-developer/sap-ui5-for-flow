#!/bin/bash

docker run \
       -it \
       -p 8899:8899 \
       --rm \
       --name javaevent/2019-oc1-dev3111 \
       demoapps/sap-ui5-for-flow:latest

