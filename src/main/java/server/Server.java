package main.java.server;



public class Server extends Thread {
    private String request;
    private HttpMethods meth;

    Server() {
        this.request = request;
        this.meth = meth;
    }

    @Override
    public void run() {
        acceptanceRequest(HttpMethods.GET);
        acceptanceRequest(HttpMethods.PUT);
        acceptanceRequest(HttpMethods.POST);
        acceptanceRequest(HttpMethods.DELETE);

    }

    private void acceptanceRequest(HttpMethods meth) {
        switch (meth) {
            case GET:
                request = "Server, get this info " + currentThread();
                break;
            case PUT:
                request = ("Server, put this info" + currentThread());
                break;
            case POST:
                request = "Post info " + currentThread();
                break;
            case DELETE:
                request = "Delete info " + currentThread();
                break;
        }
        System.out.println(request);

    }


}
