package com.VaultPay.demoui.utils;

public interface VolleyStringCallBack {
    void onSuccess();

    void onError(String error, Boolean intentar);
}
