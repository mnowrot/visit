/**
 * 
 */
package com.abb.visitisdc.fragments.tabs;

import com.abb.visitisdc.R;

/**
 * @author marcin
 * 
 */
public class FragmentTabExplore extends FragmentContentTab {

	@Override
	protected int getIdTextBottom() {
		return R.string.menu_main_explore;
	}

	@Override
	protected int getIdTabLayout() {
		return R.layout.view_tab_explore;
	}
}
