package com.example.demo.chap2.designinterface;

public interface High extends Fly {
    /**
     * Khi một interface extend một interface khác , thì interface đấy sẽ không phải override các phương thức của lớp
     * cha , mà lớp implemented sẽ làm
     */
    public void sdf();
}
