package com.virgil.wordaidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.virgil.wordaidl.IWordAidlInterface;

/**
 * Created by virgil on 2016/11/8 16:20.
 */
public class WordAIDLService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    class MyBinder extends IWordAidlInterface.Stub {

        @Override
        public String getValue() throws RemoteException {
            //可以返回数据库查询的结果等，这里为了测试就返回一个字符串
            return "这是我要共享的数据：Hello World！";
        }
    }
}
