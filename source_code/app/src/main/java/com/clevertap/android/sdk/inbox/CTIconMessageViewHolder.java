package com.clevertap.android.sdk.inbox;

import U3.g;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.Utils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class CTIconMessageViewHolder extends CTInboxBaseMessageViewHolder {
    private final RelativeLayout clickLayout;
    private final Button cta1;
    private final Button cta2;
    private final Button cta3;
    private final LinearLayout ctaLinearLayout;
    private final ImageView iconImage;
    private final TextView message;
    private final TextView timestamp;
    private final TextView title;

    public CTIconMessageViewHolder(View view) {
        super(view);
        view.setTag(this);
        this.title = (TextView) view.findViewById(R.id.messageTitle);
        this.message = (TextView) view.findViewById(R.id.messageText);
        this.mediaImage = (ImageView) view.findViewById(R.id.media_image);
        this.iconImage = (ImageView) view.findViewById(R.id.image_icon);
        this.timestamp = (TextView) view.findViewById(R.id.timestamp);
        this.cta1 = (Button) view.findViewById(R.id.cta_button_1);
        this.cta2 = (Button) view.findViewById(R.id.cta_button_2);
        this.cta3 = (Button) view.findViewById(R.id.cta_button_3);
        this.frameLayout = (FrameLayout) view.findViewById(R.id.icon_message_frame_layout);
        this.squareImage = (ImageView) view.findViewById(R.id.square_media_image);
        this.clickLayout = (RelativeLayout) view.findViewById(R.id.click_relative_layout);
        this.ctaLinearLayout = (LinearLayout) view.findViewById(R.id.cta_linear_layout);
        this.progressBarFrameLayout = (FrameLayout) view.findViewById(R.id.icon_progress_frame_layout);
        this.mediaLayout = (RelativeLayout) view.findViewById(R.id.media_layout);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:22|(13:137|26|27|(10:29|(4:57|(1:59)|60|(3:62|63|64)(2:67|(3:69|70|71)(9:74|(2:76|(5:78|79|(1:81)(1:86)|82|83)(4:87|(1:89)(1:93)|90|(1:92)))(2:94|(2:96|(1:98)))|32|(1:34)(2:53|(1:55)(1:56))|35|36|37|(4:39|(1:41)|42|43)(1:51)|(2:45|46)(1:48))))|31|32|(0)(0)|35|36|37|(0)(0)|(0)(0))(4:99|(1:101)|102|(10:104|105|106|32|(0)(0)|35|36|37|(0)(0)|(0)(0))(2:109|(10:111|112|113|32|(0)(0)|35|36|37|(0)(0)|(0)(0))(9:116|(2:118|(3:120|121|122)(2:125|(1:127)))(2:128|(2:130|(1:132)))|32|(0)(0)|35|36|37|(0)(0)|(0)(0))))|133|134|32|(0)(0)|35|36|37|(0)(0)|(0)(0))|25|26|27|(0)(0)|133|134|32|(0)(0)|35|36|37|(0)(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(1:3)(1:152)|4|(5:6|7|(1:(3:10|(2:12|(1:14))|17)(2:142|(1:144)))(2:145|(1:147))|15|17)(1:151)|18|(2:19|20)|(15:22|(13:137|26|27|(10:29|(4:57|(1:59)|60|(3:62|63|64)(2:67|(3:69|70|71)(9:74|(2:76|(5:78|79|(1:81)(1:86)|82|83)(4:87|(1:89)(1:93)|90|(1:92)))(2:94|(2:96|(1:98)))|32|(1:34)(2:53|(1:55)(1:56))|35|36|37|(4:39|(1:41)|42|43)(1:51)|(2:45|46)(1:48))))|31|32|(0)(0)|35|36|37|(0)(0)|(0)(0))(4:99|(1:101)|102|(10:104|105|106|32|(0)(0)|35|36|37|(0)(0)|(0)(0))(2:109|(10:111|112|113|32|(0)(0)|35|36|37|(0)(0)|(0)(0))(9:116|(2:118|(3:120|121|122)(2:125|(1:127)))(2:128|(2:130|(1:132)))|32|(0)(0)|35|36|37|(0)(0)|(0)(0))))|133|134|32|(0)(0)|35|36|37|(0)(0)|(0)(0))|25|26|27|(0)(0)|133|134|32|(0)(0)|35|36|37|(0)(0)|(0)(0))(15:138|(13:140|26|27|(0)(0)|133|134|32|(0)(0)|35|36|37|(0)(0)|(0)(0))|25|26|27|(0)(0)|133|134|32|(0)(0)|35|36|37|(0)(0)|(0)(0))|141|134|32|(0)(0)|35|36|37|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x078f, code lost:
    
        com.clevertap.android.sdk.Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x071e A[Catch: NoClassDefFoundError -> 0x078f, TryCatch #5 {NoClassDefFoundError -> 0x078f, blocks: (B:37:0x0714, B:39:0x071e, B:41:0x072e, B:43:0x0737, B:50:0x076e, B:51:0x0789), top: B:36:0x0714, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0789 A[Catch: NoClassDefFoundError -> 0x078f, TRY_LEAVE, TryCatch #5 {NoClassDefFoundError -> 0x078f, blocks: (B:37:0x0714, B:39:0x071e, B:41:0x072e, B:43:0x0737, B:50:0x076e, B:51:0x0789), top: B:36:0x0714, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04f0 A[Catch: NoClassDefFoundError -> 0x06cd, TryCatch #6 {NoClassDefFoundError -> 0x06cd, blocks: (B:81:0x0401, B:83:0x0410, B:85:0x044b, B:86:0x0409, B:87:0x0464, B:89:0x0474, B:90:0x0483, B:92:0x0494, B:93:0x047c, B:94:0x04ad, B:96:0x04b4, B:98:0x04d7, B:99:0x04f0, B:101:0x04fb, B:102:0x0504, B:104:0x050a, B:106:0x051c, B:108:0x0554, B:109:0x0570, B:111:0x0576, B:113:0x0588, B:115:0x05c4, B:116:0x05e4, B:118:0x05ea, B:120:0x05fa, B:122:0x0606, B:124:0x063e, B:125:0x065a, B:127:0x0674, B:128:0x068c, B:130:0x0692, B:132:0x06b5), top: B:27:0x02e8, inners: #3, #4, #7, #8 }] */
    @Override // com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void configureWithMessage(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        String orientation;
        int hashCode;
        super.configureWithMessage(cTInboxMessage, cTInboxListViewFragment, i4);
        CTInboxListViewFragment parent = getParent();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.getInboxMessageContents().get(0);
        this.title.setText(cTInboxMessageContent.getTitle());
        this.title.setTextColor(Color.parseColor(cTInboxMessageContent.getTitleColor()));
        this.message.setText(cTInboxMessageContent.getMessage());
        this.message.setTextColor(Color.parseColor(cTInboxMessageContent.getMessageColor()));
        this.clickLayout.setBackgroundColor(Color.parseColor(cTInboxMessage.getBgColor()));
        this.timestamp.setText(calculateDisplayTimestamp(cTInboxMessage.getDate()));
        this.timestamp.setTextColor(Color.parseColor(cTInboxMessageContent.getTitleColor()));
        if (cTInboxMessage.isRead()) {
            this.readDot.setVisibility(8);
        } else {
            this.readDot.setVisibility(0);
        }
        this.frameLayout.setVisibility(8);
        JSONArray links = cTInboxMessageContent.getLinks();
        if (links != null) {
            this.ctaLinearLayout.setVisibility(0);
            int length = links.length();
            try {
            } catch (JSONException e) {
                Logger.d("Error parsing CTA JSON - " + e.getLocalizedMessage());
            }
            if (length != 1) {
                if (length != 2) {
                    if (length == 3) {
                        JSONObject jSONObject = links.getJSONObject(0);
                        this.cta1.setVisibility(0);
                        this.cta1.setText(cTInboxMessageContent.getLinkText(jSONObject));
                        this.cta1.setTextColor(Color.parseColor(cTInboxMessageContent.getLinkColor(jSONObject)));
                        this.cta1.setBackgroundColor(Color.parseColor(cTInboxMessageContent.getLinkBGColor(jSONObject)));
                        JSONObject jSONObject2 = links.getJSONObject(1);
                        this.cta2.setVisibility(0);
                        this.cta2.setText(cTInboxMessageContent.getLinkText(jSONObject2));
                        this.cta2.setTextColor(Color.parseColor(cTInboxMessageContent.getLinkColor(jSONObject2)));
                        this.cta2.setBackgroundColor(Color.parseColor(cTInboxMessageContent.getLinkBGColor(jSONObject2)));
                        JSONObject jSONObject3 = links.getJSONObject(2);
                        this.cta3.setVisibility(0);
                        this.cta3.setText(cTInboxMessageContent.getLinkText(jSONObject3));
                        this.cta3.setTextColor(Color.parseColor(cTInboxMessageContent.getLinkColor(jSONObject3)));
                        this.cta3.setBackgroundColor(Color.parseColor(cTInboxMessageContent.getLinkBGColor(jSONObject3)));
                        if (parent != null) {
                            Button button = this.cta1;
                            button.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, button.getText().toString(), jSONObject, parent, false, 0));
                            Button button2 = this.cta2;
                            button2.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, button2.getText().toString(), jSONObject2, parent, false, 1));
                            Button button3 = this.cta3;
                            button3.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, button3.getText().toString(), jSONObject3, parent, false, 2));
                        }
                    }
                    i5 = 8;
                } else {
                    JSONObject jSONObject4 = links.getJSONObject(0);
                    this.cta1.setVisibility(0);
                    this.cta1.setText(cTInboxMessageContent.getLinkText(jSONObject4));
                    this.cta1.setTextColor(Color.parseColor(cTInboxMessageContent.getLinkColor(jSONObject4)));
                    this.cta1.setBackgroundColor(Color.parseColor(cTInboxMessageContent.getLinkBGColor(jSONObject4)));
                    JSONObject jSONObject5 = links.getJSONObject(1);
                    this.cta2.setVisibility(0);
                    this.cta2.setText(cTInboxMessageContent.getLinkText(jSONObject5));
                    this.cta2.setTextColor(Color.parseColor(cTInboxMessageContent.getLinkColor(jSONObject5)));
                    this.cta2.setBackgroundColor(Color.parseColor(cTInboxMessageContent.getLinkBGColor(jSONObject5)));
                    hideOneButton(this.cta1, this.cta2, this.cta3);
                    if (parent != null) {
                        Button button4 = this.cta1;
                        button4.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, button4.getText().toString(), jSONObject4, parent, false, 0));
                        Button button5 = this.cta2;
                        button5.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, button5.getText().toString(), jSONObject5, parent, false, 1));
                    }
                }
            } else {
                JSONObject jSONObject6 = links.getJSONObject(0);
                this.cta1.setVisibility(0);
                this.cta1.setText(cTInboxMessageContent.getLinkText(jSONObject6));
                this.cta1.setTextColor(Color.parseColor(cTInboxMessageContent.getLinkColor(jSONObject6)));
                this.cta1.setBackgroundColor(Color.parseColor(cTInboxMessageContent.getLinkBGColor(jSONObject6)));
                hideTwoButtons(this.cta1, this.cta2, this.cta3);
                if (parent != null) {
                    Button button6 = this.cta1;
                    button6.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, button6.getText().toString(), jSONObject6, parent, false, 0));
                }
            }
            i5 = 8;
        } else {
            i5 = 8;
            this.ctaLinearLayout.setVisibility(8);
        }
        this.mediaImage.setVisibility(i5);
        this.mediaImage.setBackgroundColor(Color.parseColor(cTInboxMessage.getBgColor()));
        this.squareImage.setVisibility(i5);
        this.squareImage.setBackgroundColor(Color.parseColor(cTInboxMessage.getBgColor()));
        this.mediaLayout.setVisibility(i5);
        this.progressBarFrameLayout.setVisibility(i5);
        try {
            orientation = cTInboxMessage.getOrientation();
            hashCode = orientation.hashCode();
        } catch (NoClassDefFoundError unused) {
            i10 = 2;
        }
        if (hashCode != 108) {
            if (hashCode == 112 && orientation.equals("p")) {
                i10 = 1;
                if (i10 == 0) {
                    if (i10 == 1) {
                        if (!TextUtils.isEmpty(cTInboxMessageContent.getMediaContentDescription())) {
                            this.squareImage.setContentDescription(cTInboxMessageContent.getMediaContentDescription());
                        }
                        if (cTInboxMessageContent.mediaIsImage()) {
                            this.mediaLayout.setVisibility(0);
                            this.squareImage.setVisibility(0);
                            this.squareImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            try {
                                com.bumptech.glide.b.echo(this.squareImage.getContext()).quebec(cTInboxMessageContent.getMedia()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(this.squareImage);
                            } catch (NoSuchMethodError unused2) {
                                Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                com.bumptech.glide.b.echo(this.squareImage.getContext()).quebec(cTInboxMessageContent.getMedia()).azure(this.squareImage);
                            }
                        } else if (cTInboxMessageContent.mediaIsGIF()) {
                            this.mediaLayout.setVisibility(0);
                            this.squareImage.setVisibility(0);
                            this.squareImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            try {
                                com.bumptech.glide.b.echo(this.squareImage.getContext()).hotel().coral(cTInboxMessageContent.getMedia()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(this.squareImage);
                            } catch (NoSuchMethodError unused3) {
                                Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                com.bumptech.glide.b.echo(this.squareImage.getContext()).hotel().coral(cTInboxMessageContent.getMedia()).azure(this.squareImage);
                            }
                        } else {
                            if (cTInboxMessageContent.mediaIsVideo()) {
                                this.mediaLayout.setVisibility(0);
                                if (!cTInboxMessageContent.getPosterUrl().isEmpty()) {
                                    this.squareImage.setVisibility(0);
                                    i10 = 2;
                                    if (CTInboxActivity.orientation == 2) {
                                        this.squareImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    } else {
                                        this.squareImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    }
                                    try {
                                        Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                        com.bumptech.glide.b.echo(this.squareImage.getContext()).quebec(cTInboxMessageContent.getPosterUrl()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).foxtrot(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).azure(this.squareImage);
                                    } catch (NoSuchMethodError unused4) {
                                        com.bumptech.glide.b.echo(this.squareImage.getContext()).quebec(cTInboxMessageContent.getPosterUrl()).azure(this.squareImage);
                                    }
                                } else {
                                    i10 = 2;
                                    this.mediaLayout.setVisibility(0);
                                    this.squareImage.setVisibility(0);
                                    if (CTInboxActivity.orientation == 2) {
                                        this.squareImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    } else {
                                        this.squareImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    }
                                    this.squareImage.setBackgroundColor(getImageBackgroundColor());
                                    int thumbnailImage = Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL);
                                    if (thumbnailImage != -1) {
                                        com.bumptech.glide.b.echo(this.squareImage.getContext()).papa(Integer.valueOf(thumbnailImage)).azure(this.squareImage);
                                    }
                                }
                            } else {
                                i10 = 2;
                                if (cTInboxMessageContent.mediaIsAudio()) {
                                    this.mediaLayout.setVisibility(0);
                                    this.squareImage.setVisibility(0);
                                    this.squareImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    this.squareImage.setBackgroundColor(getImageBackgroundColor());
                                    int thumbnailImage2 = Utils.getThumbnailImage(this.context, Constants.AUDIO_THUMBNAIL);
                                    if (thumbnailImage2 != -1) {
                                        com.bumptech.glide.b.echo(this.squareImage.getContext()).papa(Integer.valueOf(thumbnailImage2)).azure(this.squareImage);
                                    }
                                }
                            }
                            Resources resources = this.context.getResources();
                            if (CTInboxActivity.orientation != i10) {
                                i12 = resources.getDisplayMetrics().heightPixels / i10;
                                i11 = resources.getDisplayMetrics().widthPixels / i10;
                            } else {
                                i11 = resources.getDisplayMetrics().widthPixels;
                                if (cTInboxMessage.getOrientation().equalsIgnoreCase("l")) {
                                    i12 = Math.round(i11 * 0.5625f);
                                } else {
                                    i12 = i11;
                                }
                            }
                            this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
                            markItemAsRead(cTInboxMessage, i4);
                            if (cTInboxMessageContent.getIcon().isEmpty()) {
                                this.iconImage.setVisibility(0);
                                if (!cTInboxMessageContent.getIconContentDescription().isEmpty()) {
                                    this.iconImage.setContentDescription(cTInboxMessageContent.getIconContentDescription());
                                }
                                try {
                                    com.bumptech.glide.b.echo(this.iconImage.getContext()).quebec(cTInboxMessageContent.getIcon()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(this.iconImage);
                                } catch (NoSuchMethodError unused5) {
                                    Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                    com.bumptech.glide.b.echo(this.iconImage.getContext()).quebec(cTInboxMessageContent.getIcon()).azure(this.iconImage);
                                }
                            } else {
                                this.iconImage.setVisibility(i5);
                            }
                            if (parent == null) {
                                this.clickLayout.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, (String) null, (JSONObject) null, parent, true, -1));
                                return;
                            }
                            return;
                        }
                    }
                    i10 = 2;
                    Resources resources2 = this.context.getResources();
                    if (CTInboxActivity.orientation != i10) {
                    }
                    this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
                    markItemAsRead(cTInboxMessage, i4);
                    if (cTInboxMessageContent.getIcon().isEmpty()) {
                    }
                    if (parent == null) {
                    }
                } else {
                    i10 = 2;
                    if (!TextUtils.isEmpty(cTInboxMessageContent.getMediaContentDescription())) {
                        this.mediaImage.setContentDescription(cTInboxMessageContent.getMediaContentDescription());
                    }
                    if (cTInboxMessageContent.mediaIsImage()) {
                        this.mediaLayout.setVisibility(0);
                        this.mediaImage.setVisibility(0);
                        this.mediaImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            com.bumptech.glide.b.echo(this.mediaImage.getContext()).quebec(cTInboxMessageContent.getMedia()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(this.mediaImage);
                        } catch (NoSuchMethodError unused6) {
                            Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            com.bumptech.glide.b.echo(this.mediaImage.getContext()).quebec(cTInboxMessageContent.getMedia()).azure(this.mediaImage);
                        }
                        Resources resources22 = this.context.getResources();
                        if (CTInboxActivity.orientation != i10) {
                        }
                        this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
                        markItemAsRead(cTInboxMessage, i4);
                        if (cTInboxMessageContent.getIcon().isEmpty()) {
                        }
                        if (parent == null) {
                        }
                    } else if (cTInboxMessageContent.mediaIsGIF()) {
                        this.mediaLayout.setVisibility(0);
                        this.mediaImage.setVisibility(0);
                        this.mediaImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            com.bumptech.glide.b.echo(this.mediaImage.getContext()).hotel().coral(cTInboxMessageContent.getMedia()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(this.mediaImage);
                        } catch (NoSuchMethodError unused7) {
                            Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            com.bumptech.glide.b.echo(this.mediaImage.getContext()).hotel().coral(cTInboxMessageContent.getMedia()).azure(this.mediaImage);
                        }
                        Resources resources222 = this.context.getResources();
                        if (CTInboxActivity.orientation != i10) {
                        }
                        this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
                        markItemAsRead(cTInboxMessage, i4);
                        if (cTInboxMessageContent.getIcon().isEmpty()) {
                        }
                        if (parent == null) {
                        }
                    } else {
                        if (cTInboxMessageContent.mediaIsVideo()) {
                            this.mediaLayout.setVisibility(0);
                            if (!cTInboxMessageContent.getPosterUrl().isEmpty()) {
                                this.mediaImage.setVisibility(0);
                                this.mediaImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                try {
                                    com.bumptech.glide.b.echo(this.mediaImage.getContext()).quebec(cTInboxMessageContent.getPosterUrl()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).foxtrot(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).azure(this.mediaImage);
                                } catch (NoSuchMethodError unused8) {
                                    Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                    com.bumptech.glide.b.echo(this.mediaImage.getContext()).quebec(cTInboxMessageContent.getPosterUrl()).azure(this.mediaImage);
                                }
                            } else {
                                this.mediaLayout.setVisibility(0);
                                this.mediaImage.setVisibility(0);
                                this.mediaImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                int thumbnailImage3 = Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL);
                                if (thumbnailImage3 != -1) {
                                    com.bumptech.glide.b.echo(this.mediaImage.getContext()).papa(Integer.valueOf(thumbnailImage3)).azure(this.mediaImage);
                                }
                            }
                        } else if (cTInboxMessageContent.mediaIsAudio()) {
                            this.mediaLayout.setVisibility(0);
                            this.mediaImage.setVisibility(0);
                            this.mediaImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            this.mediaImage.setBackgroundColor(getImageBackgroundColor());
                            int thumbnailImage4 = Utils.getThumbnailImage(this.context, Constants.AUDIO_THUMBNAIL);
                            if (thumbnailImage4 != -1) {
                                com.bumptech.glide.b.echo(this.mediaImage.getContext()).papa(Integer.valueOf(thumbnailImage4)).azure(this.mediaImage);
                            }
                        }
                        Resources resources2222 = this.context.getResources();
                        if (CTInboxActivity.orientation != i10) {
                        }
                        this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
                        markItemAsRead(cTInboxMessage, i4);
                        if (cTInboxMessageContent.getIcon().isEmpty()) {
                        }
                        if (parent == null) {
                        }
                    }
                }
                Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
                Resources resources22222 = this.context.getResources();
                if (CTInboxActivity.orientation != i10) {
                }
                this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
                markItemAsRead(cTInboxMessage, i4);
                if (cTInboxMessageContent.getIcon().isEmpty()) {
                }
                if (parent == null) {
                }
            }
            i10 = -1;
            if (i10 == 0) {
            }
            Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
            Resources resources222222 = this.context.getResources();
            if (CTInboxActivity.orientation != i10) {
            }
            this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
            markItemAsRead(cTInboxMessage, i4);
            if (cTInboxMessageContent.getIcon().isEmpty()) {
            }
            if (parent == null) {
            }
        } else {
            if (orientation.equals("l")) {
                i10 = 0;
                if (i10 == 0) {
                }
                Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
                Resources resources2222222 = this.context.getResources();
                if (CTInboxActivity.orientation != i10) {
                }
                this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
                markItemAsRead(cTInboxMessage, i4);
                if (cTInboxMessageContent.getIcon().isEmpty()) {
                }
                if (parent == null) {
                }
            }
            i10 = -1;
            if (i10 == 0) {
            }
            Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
            Resources resources22222222 = this.context.getResources();
            if (CTInboxActivity.orientation != i10) {
            }
            this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
            markItemAsRead(cTInboxMessage, i4);
            if (cTInboxMessageContent.getIcon().isEmpty()) {
            }
            if (parent == null) {
            }
        }
        i10 = 2;
        Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        Resources resources222222222 = this.context.getResources();
        if (CTInboxActivity.orientation != i10) {
        }
        this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i11, i12));
        markItemAsRead(cTInboxMessage, i4);
        if (cTInboxMessageContent.getIcon().isEmpty()) {
        }
        if (parent == null) {
        }
    }
}
