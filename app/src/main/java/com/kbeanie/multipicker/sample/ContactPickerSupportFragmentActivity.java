package com.kbeanie.multipicker.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by kbibek on 2/19/16.
 */
public class ContactPickerSupportFragmentActivity extends AbActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_picker_support_fragment);

        getSupportActionBar().setTitle("Contact Picker");
        getSupportActionBar().setSubtitle("Support Fragment example");
    }
}