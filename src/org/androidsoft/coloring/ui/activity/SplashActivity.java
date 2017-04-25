/* Copyright (c) 2010-2011 Pierre LEVY androidsoft.org
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.androidsoft.coloring.ui.activity;

import org.androidsoft.coloring.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Splash activity
 * 
 * @author Pierre Levy
 */
public class SplashActivity extends Activity  {

	private Button mButtonPlay, mButtonPlay2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.splash);

		mButtonPlay = (Button) findViewById(R.id.button_go);
		//mButtonPlay.setOnClickListener(this);
		mButtonPlay2 = (Button) findViewById(R.id.button_go2);
		//mButtonPlay2.setOnClickListener(this);

		ImageView image = (ImageView) findViewById(R.id.image_splash);
		image.setImageResource(R.drawable.splach_icon);

	}

	/**
	 * {@inheritDoc }
	 */
	public void onClick(View v) {
		if (v == mButtonPlay) {
			Intent intent = new Intent(this, PaintActivity.class);
			startActivity(intent);
		} else if (v == mButtonPlay2) {
			Intent intent = new Intent(this, PaintActivity2.class);
			startActivity(intent);
		}
	}

	
}