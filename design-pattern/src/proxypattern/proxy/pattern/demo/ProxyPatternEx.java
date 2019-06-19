package proxypattern.proxy.pattern.demo;

import proxypattern.proxyclasses.Proxy;

public class ProxyPatternEx {

    public static void main(String[] args) {
        System.out.println("*** Proxy Pattern Demo ***\n");

        Proxy px = new Proxy();

        px.doSomeWork();
    }
}
