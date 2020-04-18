package com.company;

public class TenuringThreshold {
    private static final int _1M = 1024 * 1204;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1M / 4];
        allocation2 = new byte[4 * _1M];
        allocation3 = new byte[4 * _1M];
        allocation3 = null;
        allocation4 = new byte[4 * _1M];

    }
}
