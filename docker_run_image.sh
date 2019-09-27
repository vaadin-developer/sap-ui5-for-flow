#!/bin/bash

docker run \
       -it \
       -p 8899:8899 \
       --rm \
       --name javaevent/2019-oc1-dev3111 \
       javaevents/2019-oc1-dev3111:latest

