package org.owh.angelica.base;

import android.support.v4.app.FragmentActivity;

public class AngelicaFragmentActivity extends FragmentActivity {
	public AngelicaApplication getAngelicaApplication() {
		return (AngelicaApplication) this.getApplication();
	}
}
