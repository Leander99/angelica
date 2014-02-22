package org.owh.angelica.base;
import java.util.Hashtable;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;


public class AngelicaApplication extends Application {
	private static String TAG = "MyApplication";
	
	// Font are not released property in Android 3.0, to rpevent memoery loss we should cache any font assests
	private static final Hashtable<String, Typeface> fontsCache = new Hashtable<String, Typeface>();
	
	public static String SCRINGO_APP_ID = "mFLCyV2rPgMQwbwFwUooxCqE2Negc7rW";
	
	public static Typeface getTypeFace(Context c, String assetPath) {
		synchronized (fontsCache) {
			if (!fontsCache.containsKey(assetPath)) {
				try {
					Typeface t = Typeface.createFromAsset(c.getAssets(),assetPath);
					fontsCache.put(assetPath, t);
				} catch (Exception e) {
					Log.e(TAG, "Could not get typeface '" + assetPath + "' because " + e.getMessage());
					return null;
				}
			}
			return fontsCache.get(assetPath);		
		}
	}			
}
