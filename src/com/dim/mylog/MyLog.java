package com.dim.mylog;

import android.util.Log;

public class MyLog {

	/**
	 * verbose
	 */
	private static int levelV=1;
	/**
	 * debug
	 */
	private static int levelD=2;
	/**
	 * info
	 */
	private static int levelI=3;
	/**
	 * warning
	 */
	private static int levelW=4;
	/**
	 * error
	 */
	private static int levelE=5;
	/**
	 * level of log  default is 3. print the verbose ,debug ,info log.
	 */
	private static int level=3;
	/**
	 * 
	 * @param level
	 * 1  Level v
	 * 2  level D
	 * 3  level I
	 * 4  level W
	 * 5  level E
	 * 
	 * 传入参数 确定log优先级，比如传入5，则显示所有log。
	 */
	public  static void setLogLevel(int l)
	{
		 level=l;
	}
	public static void MyLogV(String TAG,String msg)
	{
		if(level>=levelV)
		{
		Log.v(TAG, msg)	; 
		}
	}
	
	public static void MyLogD(String TAG,String msg)
	{
		if(level>=levelD)
		{
			Log.d(TAG, msg)	;
		}
	}
	
	
	public static void MyLogI(String TAG,String msg)
	{
		if(level>=levelI)
		{
		Log.i(TAG, msg)	;
		}
	}
	
	
	public static void MyLogW(String TAG,String msg)
	{
		if(level>=levelW)
		{
		Log.i(TAG, msg)	;
		}
	}
	
	public static void MyLogE(String TAG,String msg)
	{
		if(level>=levelE)
		{
		Log.e(TAG, msg)	;
		}
	}
	
	 
}
