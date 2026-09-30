package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import androidx.fragment.app.an;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.CTInboxListener;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.DidClickForHardPermissionListener;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.PushPermissionHandler;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.google.android.material.tabs.TabLayout;
import i1.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import k7.h;

/* loaded from: classes3.dex */
public class CTInboxActivity extends an implements CTInboxListViewFragment.InboxListener, DidClickForHardPermissionListener {
    public static int orientation;
    private CleverTapAPI cleverTapAPI;
    private CleverTapInstanceConfig config;
    private CTInboxListener inboxContentUpdatedListener = null;
    CTInboxTabAdapter inboxTabAdapter;
    private WeakReference<InboxActivityListener> listenerWeakReference;
    private PushPermissionHandler pushPermissionHandler;
    CTInboxStyleConfig styleConfig;
    TabLayout tabLayout;
    ViewPager viewPager;

    /* loaded from: classes3.dex */
    public interface InboxActivityListener {
        void messageDidClick(CTInboxActivity cTInboxActivity, int i4, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> hashMap, int i5);

        void messageDidShow(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    private String getFragmentTag() {
        return this.config.getAccountId() + ":CT_INBOX_LIST_VIEW_FRAGMENT";
    }

    @Override // com.clevertap.android.sdk.DidClickForHardPermissionListener
    public void didCancelPermissionRequest() {
        PushPermissionHandler pushPermissionHandler = this.pushPermissionHandler;
        if (pushPermissionHandler != null) {
            pushPermissionHandler.notifyPushPermissionExternalListeners(this);
        }
    }

    public void didClick(Bundle bundle, int i4, CTInboxMessage cTInboxMessage, HashMap<String, String> hashMap, int i5) {
        InboxActivityListener listener = getListener();
        if (listener != null) {
            listener.messageDidClick(this, i4, cTInboxMessage, bundle, hashMap, i5);
        }
    }

    @Override // com.clevertap.android.sdk.DidClickForHardPermissionListener
    public void didClickForHardPermissionWithFallbackSettings(boolean z2) {
        PushPermissionHandler pushPermissionHandler = this.pushPermissionHandler;
        if (pushPermissionHandler != null) {
            pushPermissionHandler.requestPermission(this, z2);
        }
    }

    public void didShow(Bundle bundle, CTInboxMessage cTInboxMessage) {
        Logger.v("CTInboxActivity:didShow() called with: data = [" + bundle + "], inboxMessage = [" + cTInboxMessage.getMessageId() + Constants.AES_SUFFIX);
        InboxActivityListener listener = getListener();
        if (listener != null) {
            listener.messageDidShow(this, cTInboxMessage, bundle);
        }
    }

    public InboxActivityListener getListener() {
        InboxActivityListener inboxActivityListener;
        try {
            inboxActivityListener = this.listenerWeakReference.get();
        } catch (Throwable unused) {
            inboxActivityListener = null;
        }
        if (inboxActivityListener == null) {
            this.config.getLogger().verbose(this.config.getAccountId(), "InboxActivityListener is null for notification inbox ");
        }
        return inboxActivityListener;
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxListViewFragment.InboxListener
    public void messageDidClick(Context context, int i4, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> hashMap, int i5) {
        didClick(bundle, i4, cTInboxMessage, hashMap, i5);
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxListViewFragment.InboxListener
    public void messageDidShow(Context context, CTInboxMessage cTInboxMessage, Bundle bundle) {
        Logger.v("CTInboxActivity:messageDidShow() called with: data = [" + bundle + "], inboxMessage = [" + cTInboxMessage.getMessageId() + Constants.AES_SUFFIX);
        didShow(bundle, cTInboxMessage);
    }

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.styleConfig = (CTInboxStyleConfig) extras.getParcelable("styleConfig");
                Bundle bundle2 = extras.getBundle("configBundle");
                if (bundle2 != null) {
                    this.config = (CleverTapInstanceConfig) bundle2.getParcelable(Constants.KEY_CONFIG);
                }
                CleverTapAPI instanceWithConfig = CleverTapAPI.instanceWithConfig(getApplicationContext(), this.config);
                this.cleverTapAPI = instanceWithConfig;
                if (instanceWithConfig != null) {
                    setListener(instanceWithConfig);
                    this.pushPermissionHandler = new PushPermissionHandler(this.config, this.cleverTapAPI.getCoreState().getCallbackManager().getPushPermissionResponseListenerList());
                }
                orientation = getResources().getConfiguration().orientation;
                setContentView(R.layout.inbox_activity);
                this.cleverTapAPI.getCoreState().getCoreMetaData().setAppInboxActivity(this);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                toolbar.setTitle(this.styleConfig.getNavBarTitle());
                toolbar.setTitleTextColor(Color.parseColor(this.styleConfig.getNavBarTitleColor()));
                toolbar.setBackgroundColor(Color.parseColor(this.styleConfig.getNavBarColor()));
                Resources resources = getResources();
                int i4 = R.drawable.ct_ic_arrow_back_white_24dp;
                ThreadLocal threadLocal = k.alpha;
                Drawable drawable = resources.getDrawable(i4, null);
                if (drawable != null) {
                    drawable.setColorFilter(Color.parseColor(this.styleConfig.getBackButtonColor()), PorterDuff.Mode.SRC_IN);
                }
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.ct_inbox_back_button_content_description));
                toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.clevertap.android.sdk.inbox.CTInboxActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        CTInboxActivity.this.finish();
                    }
                });
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.inbox_linear_layout);
                linearLayout.setBackgroundColor(Color.parseColor(this.styleConfig.getInboxBackgroundColor()));
                this.tabLayout = (TabLayout) linearLayout.findViewById(R.id.tab_layout);
                this.viewPager = (ViewPager) linearLayout.findViewById(R.id.view_pager);
                TextView textView = (TextView) findViewById(R.id.no_message_view);
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(Constants.KEY_CONFIG, this.config);
                bundle3.putParcelable("styleConfig", this.styleConfig);
                int i5 = 0;
                if (!this.styleConfig.isUsingTabs()) {
                    this.viewPager.setVisibility(8);
                    this.tabLayout.setVisibility(8);
                    CleverTapAPI cleverTapAPI = this.cleverTapAPI;
                    if (cleverTapAPI != null && cleverTapAPI.getInboxMessageCount() == 0) {
                        textView.setBackgroundColor(Color.parseColor(this.styleConfig.getInboxBackgroundColor()));
                        textView.setVisibility(0);
                        textView.setText(this.styleConfig.getNoMessageViewText());
                        textView.setTextColor(Color.parseColor(this.styleConfig.getNoMessageViewTextColor()));
                        return;
                    }
                    ((FrameLayout) findViewById(R.id.list_view_fragment)).setVisibility(0);
                    textView.setVisibility(8);
                    for (ai aiVar : getSupportFragmentManager().charlie.foxtrot()) {
                        if (aiVar.getTag() != null && !aiVar.getTag().equalsIgnoreCase(getFragmentTag())) {
                            i5 = 1;
                        }
                    }
                    if (i5 == 0) {
                        CTInboxListViewFragment cTInboxListViewFragment = new CTInboxListViewFragment();
                        cTInboxListViewFragment.setArguments(bundle3);
                        L supportFragmentManager = getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        C0606a c0606a = new C0606a(supportFragmentManager);
                        c0606a.delta(R.id.list_view_fragment, cTInboxListViewFragment, getFragmentTag(), 1);
                        c0606a.india();
                        return;
                    }
                    return;
                }
                this.viewPager.setVisibility(0);
                ArrayList<String> tabs = this.styleConfig.getTabs();
                this.inboxTabAdapter = new CTInboxTabAdapter(getSupportFragmentManager(), tabs.size() + 1);
                this.tabLayout.setVisibility(0);
                this.tabLayout.setTabGravity(0);
                this.tabLayout.setTabMode(1);
                this.tabLayout.setSelectedTabIndicatorColor(Color.parseColor(this.styleConfig.getSelectedTabIndicatorColor()));
                TabLayout tabLayout = this.tabLayout;
                int parseColor = Color.parseColor(this.styleConfig.getUnselectedTabColor());
                int parseColor2 = Color.parseColor(this.styleConfig.getSelectedTabColor());
                tabLayout.getClass();
                tabLayout.setTabTextColors(TabLayout.foxtrot(parseColor, parseColor2));
                this.tabLayout.setBackgroundColor(Color.parseColor(this.styleConfig.getTabBackgroundColor()));
                Bundle bundle4 = (Bundle) bundle3.clone();
                bundle4.putInt("position", 0);
                CTInboxListViewFragment cTInboxListViewFragment2 = new CTInboxListViewFragment();
                cTInboxListViewFragment2.setArguments(bundle4);
                this.inboxTabAdapter.addFragment(cTInboxListViewFragment2, this.styleConfig.getFirstTabTitle(), 0);
                while (i5 < tabs.size()) {
                    String str = tabs.get(i5);
                    i5++;
                    Bundle bundle5 = (Bundle) bundle3.clone();
                    bundle5.putInt("position", i5);
                    bundle5.putString("filter", str);
                    CTInboxListViewFragment cTInboxListViewFragment3 = new CTInboxListViewFragment();
                    cTInboxListViewFragment3.setArguments(bundle5);
                    this.inboxTabAdapter.addFragment(cTInboxListViewFragment3, str, i5);
                    this.viewPager.setOffscreenPageLimit(i5);
                }
                this.viewPager.setAdapter(this.inboxTabAdapter);
                this.inboxTabAdapter.notifyDataSetChanged();
                this.viewPager.addOnPageChangeListener(new h(this.tabLayout));
                this.tabLayout.setupWithViewPager(this.viewPager);
                return;
            }
            throw new IllegalArgumentException();
        } catch (Throwable th) {
            Logger.v("Cannot find a valid notification inbox bundle to show!", th);
        }
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onDestroy() {
        this.cleverTapAPI.getCoreState().getCoreMetaData().setAppInboxActivity(null);
        if (this.styleConfig.isUsingTabs()) {
            for (ai aiVar : getSupportFragmentManager().charlie.foxtrot()) {
                if (aiVar instanceof CTInboxListViewFragment) {
                    Logger.v("Removing fragment - " + aiVar.toString());
                    getSupportFragmentManager().charlie.foxtrot().remove(aiVar);
                }
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        PushPermissionHandler pushPermissionHandler = this.pushPermissionHandler;
        if (pushPermissionHandler != null) {
            pushPermissionHandler.onRequestPermissionsResult(this, i4, iArr);
        }
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onResume() {
        super.onResume();
        PushPermissionHandler pushPermissionHandler = this.pushPermissionHandler;
        if (pushPermissionHandler != null) {
            pushPermissionHandler.onActivityResume(this);
        }
    }

    public void setListener(InboxActivityListener inboxActivityListener) {
        this.listenerWeakReference = new WeakReference<>(inboxActivityListener);
    }
}
