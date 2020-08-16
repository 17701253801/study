FROM golang:1.14
RUN mkdir /app
COPY ./test.go /app/app.go
WORKDIR /app
ENTRYPOINT ["go","run","/app/app.go"]

