package com.mytest;

public class SignatureData {

    private String nonce;
    private String payload;


	SignatureData(){ 
		 System.out.println("def ");
	}

	SignatureData(String n, String p) {
		System.out.println("OK");
		nonce = n;
		payload = p;
	}
   public void setNonce(String n) {
		 System.out.println("set n  ");
        nonce = n;
    }

   public void setPayload(String p) {
		 System.out.println("set p  ");
        payload = p;
    }



    public String getNonce() {
        return nonce;
    }

    public String getPayload() {
        return payload;
    }
}
