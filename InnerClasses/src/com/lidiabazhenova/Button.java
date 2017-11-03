package com.lidiabazhenova;

public class Button {
    private String title;
    private OnClickLister onClickLister;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setOnClickLister(OnClickLister onClickLister) {
        this.onClickLister=onClickLister;
    }
    public  void onClick() {
        this.onClickLister.onClick(this.title);
    }

    public interface OnClickLister {
        public void onClick(String title);
    }
}
