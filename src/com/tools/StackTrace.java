package com.tools;

import android.util.Log;

public class StackTrace {
	private static final String TAG = "StackTrace";
	
	private StackTrace() {
		
	}
	
	public static final void printStackTrace() {
		StackTraceElement[] stackElements = new Throwable().getStackTrace();
		if (stackElements != null) {
			for (StackTraceElement st : stackElements) {
				Log.i(TAG, st.toString());
			}
		}
	}
}
