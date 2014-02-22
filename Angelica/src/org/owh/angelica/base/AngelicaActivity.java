package org.owh.angelica.base;

import android.app.Activity;

public class AngelicaActivity extends Activity {
	public AngelicaApplication getAngelicaApplication() {
		return (AngelicaApplication) this.getApplication();
	}
}
