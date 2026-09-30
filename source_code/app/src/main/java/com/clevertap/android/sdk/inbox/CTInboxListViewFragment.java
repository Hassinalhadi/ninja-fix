package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.DidClickForHardPermissionListener;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.customviews.VerticalSpaceItemDecoration;
import com.clevertap.android.sdk.video.VideoLibChecker;
import j1.C1929c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONObject;
import s1.a0;
import s1.al;
import s1.au;

/* loaded from: classes3.dex */
public class CTInboxListViewFragment extends ai {
    CleverTapInstanceConfig config;
    private DidClickForHardPermissionListener didClickForHardPermissionListener;
    private CTInboxMessageAdapter inboxMessageAdapter;
    LinearLayout linearLayout;
    private WeakReference<InboxListener> listenerWeakReference;
    MediaPlayerRecyclerView mediaRecyclerView;
    RecyclerView recyclerView;
    CTInboxStyleConfig styleConfig;
    private int tabPosition;
    boolean haveVideoPlayerSupport = VideoLibChecker.haveVideoPlayerSupport;
    ArrayList<CTInboxMessage> inboxMessages = new ArrayList<>();
    private boolean firstTime = true;

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxListViewFragment$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CTInboxListViewFragment.this.mediaRecyclerView.playVideo();
        }
    }

    /* loaded from: classes3.dex */
    public interface InboxListener {
        void messageDidClick(Context context, int i4, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> hashMap, int i5);

        void messageDidShow(Context context, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    private void applySystemBarsInsets(RecyclerView recyclerView) {
        recyclerView.setClipToPadding(false);
        S7.a aVar = new S7.a(26);
        WeakHashMap weakHashMap = au.alpha;
        al.lima(recyclerView, aVar);
    }

    private ArrayList<CTInboxMessage> filterMessages(ArrayList<CTInboxMessage> arrayList, String str) {
        ArrayList<CTInboxMessage> arrayList2 = new ArrayList<>();
        Iterator<CTInboxMessage> it = arrayList.iterator();
        while (it.hasNext()) {
            CTInboxMessage next = it.next();
            if (next.getTags() != null && next.getTags().size() > 0) {
                Iterator<String> it2 = next.getTags().iterator();
                while (it2.hasNext()) {
                    if (it2.next().equalsIgnoreCase(str)) {
                        arrayList2.add(next);
                    }
                }
            }
        }
        return arrayList2;
    }

    public static a0 lambda$applySystemBarsInsets$0(View view, a0 a0Var) {
        C1929c golf = a0Var.alpha.golf(519);
        view.setPadding(golf.alpha, 0, golf.charlie, golf.delta);
        return a0.bravo;
    }

    private boolean shouldAutoPlayOnFirstLaunch() {
        if (this.tabPosition <= 0) {
            return true;
        }
        return false;
    }

    private void updateInboxMessages() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("filter", null);
            CleverTapAPI instanceWithConfig = CleverTapAPI.instanceWithConfig(getActivity(), this.config);
            if (instanceWithConfig != null) {
                Logger.v("CTInboxListViewFragment:onAttach() called with: tabPosition = [" + this.tabPosition + "], filter = [" + string + Constants.AES_SUFFIX);
                ArrayList<CTInboxMessage> allInboxMessages = instanceWithConfig.getAllInboxMessages();
                if (string != null) {
                    allInboxMessages = filterMessages(allInboxMessages, string);
                }
                this.inboxMessages = allInboxMessages;
            }
        }
    }

    public void didClick(Bundle bundle, int i4, int i5, HashMap<String, String> hashMap, int i10) {
        InboxListener listener = getListener();
        if (listener != null) {
            listener.messageDidClick(getActivity().getBaseContext(), i5, this.inboxMessages.get(i4), bundle, hashMap, i10);
        }
    }

    public void didShow(Bundle bundle, int i4) {
        InboxListener listener = getListener();
        if (listener != null) {
            Logger.v("CTInboxListViewFragment:didShow() called with: data = [" + bundle + "], position = [" + i4 + Constants.AES_SUFFIX);
            listener.messageDidShow(getActivity().getBaseContext(), this.inboxMessages.get(i4), bundle);
        }
    }

    public void fireUrlThroughIntent(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.replace("\n", "").replace("\r", "")));
            if (getActivity() != null) {
                Utils.setPackageNameFromResolveInfoList(getActivity(), intent);
            }
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public InboxListener getListener() {
        InboxListener inboxListener;
        try {
            inboxListener = this.listenerWeakReference.get();
        } catch (Throwable unused) {
            inboxListener = null;
        }
        if (inboxListener == null) {
            Logger.v("InboxListener is null for messages");
        }
        return inboxListener;
    }

    public MediaPlayerRecyclerView getMediaRecyclerView() {
        return this.mediaRecyclerView;
    }

    public void handleClick(int i4, int i5, String str, JSONObject jSONObject, HashMap<String, String> hashMap, int i10) {
        try {
            if (jSONObject != null) {
                String linktype = this.inboxMessages.get(i4).getInboxMessageContents().get(0).getLinktype(jSONObject);
                if (linktype.equalsIgnoreCase(Constants.KEY_URL)) {
                    String linkUrl = this.inboxMessages.get(i4).getInboxMessageContents().get(0).getLinkUrl(jSONObject);
                    if (linkUrl != null) {
                        fireUrlThroughIntent(linkUrl);
                    }
                } else if (linktype.contains(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION) && this.didClickForHardPermissionListener != null) {
                    this.didClickForHardPermissionListener.didClickForHardPermissionWithFallbackSettings(this.inboxMessages.get(i4).getInboxMessageContents().get(0).isFallbackSettingsEnabled(jSONObject));
                }
            } else {
                String actionUrl = this.inboxMessages.get(i4).getInboxMessageContents().get(0).getActionUrl();
                if (actionUrl != null) {
                    fireUrlThroughIntent(actionUrl);
                }
            }
            Bundle bundle = new Bundle();
            JSONObject wzrkParams = this.inboxMessages.get(i4).getWzrkParams();
            Iterator<String> keys = wzrkParams.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.startsWith(Constants.WZRK_PREFIX)) {
                    bundle.putString(next, wzrkParams.getString(next));
                }
            }
            if (str != null && !str.isEmpty()) {
                bundle.putString(Constants.KEY_C2A, str);
            }
            didClick(bundle, i4, i5, hashMap, i10);
        } catch (Throwable th) {
            Logger.d("Error handling notification button click: " + th.getCause());
        }
    }

    public void handleViewPagerClick(int i4, int i5) {
        Throwable th;
        try {
            Bundle bundle = new Bundle();
            JSONObject wzrkParams = this.inboxMessages.get(i4).getWzrkParams();
            Iterator<String> keys = wzrkParams.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (next.startsWith(Constants.WZRK_PREFIX)) {
                        bundle.putString(next, wzrkParams.getString(next));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Logger.d("Error handling notification button click: " + th.getCause());
                }
            }
            try {
                didClick(bundle, i4, i5, null, -1);
                fireUrlThroughIntent(this.inboxMessages.get(i4).getInboxMessageContents().get(i5).getActionUrl());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                Logger.d("Error handling notification button click: " + th.getCause());
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ai
    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.config = (CleverTapInstanceConfig) arguments.getParcelable(Constants.KEY_CONFIG);
            this.styleConfig = (CTInboxStyleConfig) arguments.getParcelable("styleConfig");
            this.tabPosition = arguments.getInt("position", -1);
            updateInboxMessages();
            if (context instanceof CTInboxActivity) {
                setListener((InboxListener) getActivity());
            }
            if (context instanceof DidClickForHardPermissionListener) {
                this.didClickForHardPermissionListener = (DidClickForHardPermissionListener) context;
            }
        }
    }

    @Override // androidx.fragment.app.ai
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.inbox_list_view, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.list_view_linear_layout);
        this.linearLayout = linearLayout;
        linearLayout.setBackgroundColor(Color.parseColor(this.styleConfig.getInboxBackgroundColor()));
        TextView textView = (TextView) inflate.findViewById(R.id.list_view_no_message_view);
        if (this.inboxMessages.size() <= 0) {
            textView.setVisibility(0);
            textView.setText(this.styleConfig.getNoMessageViewText());
            textView.setTextColor(Color.parseColor(this.styleConfig.getNoMessageViewTextColor()));
            return inflate;
        }
        textView.setVisibility(8);
        getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.inboxMessageAdapter = new CTInboxMessageAdapter(this.inboxMessages, this);
        if (this.haveVideoPlayerSupport) {
            MediaPlayerRecyclerView mediaPlayerRecyclerView = new MediaPlayerRecyclerView(getActivity());
            this.mediaRecyclerView = mediaPlayerRecyclerView;
            mediaPlayerRecyclerView.setVisibility(0);
            this.mediaRecyclerView.setLayoutManager(linearLayoutManager);
            this.mediaRecyclerView.addItemDecoration(new VerticalSpaceItemDecoration(18));
            this.mediaRecyclerView.setItemAnimator(new r());
            applySystemBarsInsets(this.mediaRecyclerView);
            this.mediaRecyclerView.setAdapter(this.inboxMessageAdapter);
            this.inboxMessageAdapter.notifyDataSetChanged();
            this.linearLayout.addView(this.mediaRecyclerView);
            if (this.firstTime && shouldAutoPlayOnFirstLaunch()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.clevertap.android.sdk.inbox.CTInboxListViewFragment.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        CTInboxListViewFragment.this.mediaRecyclerView.playVideo();
                    }
                }, 1000L);
                this.firstTime = false;
            }
            return inflate;
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list_view_recycler_view);
        this.recyclerView = recyclerView;
        recyclerView.setVisibility(0);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(18));
        this.recyclerView.setItemAnimator(new r());
        applySystemBarsInsets(this.recyclerView);
        this.recyclerView.setAdapter(this.inboxMessageAdapter);
        this.inboxMessageAdapter.notifyDataSetChanged();
        return inflate;
    }

    @Override // androidx.fragment.app.ai
    public void onDestroy() {
        super.onDestroy();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.mediaRecyclerView;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.stop();
        }
    }

    @Override // androidx.fragment.app.ai
    public void onPause() {
        super.onPause();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.mediaRecyclerView;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.onPausePlayer();
        }
    }

    @Override // androidx.fragment.app.ai
    public void onResume() {
        super.onResume();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.mediaRecyclerView;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.onRestartPlayer();
        }
    }

    @Override // androidx.fragment.app.ai
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.mediaRecyclerView;
        if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.getLayoutManager() != null) {
            bundle.putParcelable("recyclerLayoutState", this.mediaRecyclerView.getLayoutManager().e());
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && recyclerView.getLayoutManager() != null) {
            bundle.putParcelable("recyclerLayoutState", this.recyclerView.getLayoutManager().e());
        }
    }

    @Override // androidx.fragment.app.ai
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("recyclerLayoutState");
            MediaPlayerRecyclerView mediaPlayerRecyclerView = this.mediaRecyclerView;
            if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.getLayoutManager() != null) {
                this.mediaRecyclerView.getLayoutManager().d(parcelable);
            }
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null && recyclerView.getLayoutManager() != null) {
                this.recyclerView.getLayoutManager().d(parcelable);
            }
        }
    }

    public void setListener(InboxListener inboxListener) {
        this.listenerWeakReference = new WeakReference<>(inboxListener);
    }

    public void setMediaRecyclerView(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        this.mediaRecyclerView = mediaPlayerRecyclerView;
    }
}
