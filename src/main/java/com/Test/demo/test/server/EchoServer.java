package com.Test.demo.test.server;

public class EchoServer {
	private final int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("Usage: " + EchoServer.class.getSimpleName() + " <port>");
			return;
		}
		int port = Integer.parseInt(args[0]);
	}
}
