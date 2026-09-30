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
class CTSimpleMessageViewHolder extends CTInboxBaseMessageViewHolder {
    private final Button cta1;
    private final Button cta2;
    private final Button cta3;
    private final TextView message;
    private final TextView timestamp;
    private final TextView title;

    public CTSimpleMessageViewHolder(View view) {
        super(view);
        view.setTag(this);
        this.title = (TextView) view.findViewById(R.id.messageTitle);
        this.message = (TextView) view.findViewById(R.id.messageText);
        this.timestamp = (TextView) view.findViewById(R.id.timestamp);
        this.cta1 = (Button) view.findViewById(R.id.cta_button_1);
        this.cta2 = (Button) view.findViewById(R.id.cta_button_2);
        this.cta3 = (Button) view.findViewById(R.id.cta_button_3);
        this.mediaImage = (ImageView) view.findViewById(R.id.media_image);
        this.relativeLayout = (RelativeLayout) view.findViewById(R.id.simple_message_relative_layout);
        this.frameLayout = (FrameLayout) view.findViewById(R.id.simple_message_frame_layout);
        this.squareImage = (ImageView) view.findViewById(R.id.square_media_image);
        this.clickLayout = (RelativeLayout) view.findViewById(R.id.click_relative_layout);
        this.ctaLinearLayout = (LinearLayout) view.findViewById(R.id.cta_linear_layout);
        this.bodyRelativeLayout = (LinearLayout) view.findViewById(R.id.body_linear_layout);
        this.progressBarFrameLayout = (FrameLayout) view.findViewById(R.id.simple_progress_frame_layout);
        this.mediaLayout = (RelativeLayout) view.findViewById(R.id.media_layout);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04ca A[Catch: NoClassDefFoundError -> 0x06a1, TryCatch #2 {NoClassDefFoundError -> 0x06a1, blocks: (B:19:0x02a4, B:28:0x02d7, B:30:0x02e1, B:31:0x02ea, B:33:0x02f0, B:35:0x0301, B:37:0x0339, B:38:0x0355, B:40:0x035b, B:42:0x036c, B:44:0x03a8, B:45:0x03c8, B:47:0x03ce, B:49:0x03d8, B:51:0x03e7, B:53:0x03f6, B:55:0x042e, B:56:0x03ef, B:57:0x044a, B:59:0x0459, B:60:0x0468, B:62:0x0470, B:63:0x0461, B:64:0x0489, B:66:0x048f, B:68:0x04b1, B:82:0x04ca, B:84:0x04d4, B:85:0x04dd, B:87:0x04e3, B:89:0x04f4, B:91:0x052c, B:92:0x0548, B:94:0x054e, B:96:0x055f, B:98:0x059b, B:99:0x05bb, B:101:0x05c1, B:103:0x05cb, B:105:0x05dc, B:107:0x0614, B:108:0x0630, B:110:0x0649, B:111:0x0661, B:113:0x0667, B:115:0x0689, B:116:0x02b6, B:119:0x02c0), top: B:18:0x02a4, inners: #1, #3, #4, #5, #6, #7 }] */
    @Override // com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void configureWithMessage(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i4) {
        int i5;
        int i10;
        String orientation;
        int hashCode;
        boolean z2;
        super.configureWithMessage(cTInboxMessage, cTInboxListViewFragment, i4);
        CTInboxListViewFragment parent = getParent();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.getInboxMessageContents().get(0);
        this.title.setText(cTInboxMessageContent.getTitle());
        this.title.setTextColor(Color.parseColor(cTInboxMessageContent.getTitleColor()));
        this.message.setText(cTInboxMessageContent.getMessage());
        this.message.setTextColor(Color.parseColor(cTInboxMessageContent.getMessageColor()));
        this.bodyRelativeLayout.setBackgroundColor(Color.parseColor(cTInboxMessage.getBgColor()));
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
            } catch (JSONException e) {
                Logger.d("Error parsing CTA JSON - " + e.getLocalizedMessage());
            }
        } else {
            this.ctaLinearLayout.setVisibility(8);
        }
        this.mediaImage.setVisibility(8);
        this.mediaImage.setBackgroundColor(Color.parseColor(cTInboxMessage.getBgColor()));
        this.squareImage.setVisibility(8);
        this.squareImage.setBackgroundColor(Color.parseColor(cTInboxMessage.getBgColor()));
        this.mediaLayout.setVisibility(8);
        this.progressBarFrameLayout.setVisibility(8);
        try {
            orientation = cTInboxMessage.getOrientation();
            hashCode = orientation.hashCode();
        } catch (NoClassDefFoundError unused) {
            Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        if (hashCode != 108) {
            if (hashCode == 112 && orientation.equals("p")) {
                z2 = true;
                if (!z2) {
                    if (z2) {
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
                        } else if (cTInboxMessageContent.mediaIsVideo()) {
                            if (!cTInboxMessageContent.getPosterUrl().isEmpty()) {
                                this.mediaLayout.setVisibility(0);
                                this.squareImage.setVisibility(0);
                                if (CTInboxActivity.orientation == 2) {
                                    this.squareImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                } else {
                                    this.squareImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                }
                                try {
                                    com.bumptech.glide.b.echo(this.squareImage.getContext()).quebec(cTInboxMessageContent.getPosterUrl()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).foxtrot(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).azure(this.squareImage);
                                } catch (NoSuchMethodError unused4) {
                                    Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                    com.bumptech.glide.b.echo(this.squareImage.getContext()).quebec(cTInboxMessageContent.getPosterUrl()).azure(this.squareImage);
                                }
                            } else {
                                this.mediaLayout.setVisibility(0);
                                this.squareImage.setVisibility(0);
                                if (CTInboxActivity.orientation == 2) {
                                    this.squareImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                } else {
                                    this.squareImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                }
                                int thumbnailImage = Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL);
                                if (thumbnailImage != -1) {
                                    com.bumptech.glide.b.echo(this.squareImage.getContext()).papa(Integer.valueOf(thumbnailImage)).azure(this.squareImage);
                                }
                            }
                        } else if (cTInboxMessageContent.mediaIsAudio()) {
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
                    if (CTInboxActivity.orientation == 2) {
                        i10 = resources.getDisplayMetrics().heightPixels / 2;
                        i5 = resources.getDisplayMetrics().widthPixels / 2;
                    } else {
                        i5 = resources.getDisplayMetrics().widthPixels;
                        if (cTInboxMessage.getOrientation().equalsIgnoreCase("l")) {
                            i10 = Math.round(i5 * 0.5625f);
                        } else {
                            i10 = i5;
                        }
                    }
                    this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i5, i10));
                    markItemAsRead(cTInboxMessage, i4);
                    if (parent != null) {
                        this.clickLayout.setOnClickListener(new CTInboxButtonClickListener(i4, cTInboxMessage, (String) null, (JSONObject) null, parent, true, -1));
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(cTInboxMessageContent.getMediaContentDescription())) {
                    this.mediaImage.setContentDescription(cTInboxMessageContent.getMediaContentDescription());
                }
                if (cTInboxMessageContent.mediaIsImage()) {
                    this.mediaLayout.setVisibility(0);
                    this.mediaImage.setVisibility(0);
                    this.mediaImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    try {
                        com.bumptech.glide.b.echo(this.mediaImage.getContext()).quebec(cTInboxMessageContent.getMedia()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(this.mediaImage);
                    } catch (NoSuchMethodError unused5) {
                        Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        com.bumptech.glide.b.echo(this.mediaImage.getContext()).quebec(cTInboxMessageContent.getMedia()).azure(this.mediaImage);
                    }
                    Resources resources2 = this.context.getResources();
                    if (CTInboxActivity.orientation == 2) {
                    }
                    this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i5, i10));
                    markItemAsRead(cTInboxMessage, i4);
                    if (parent != null) {
                    }
                } else if (cTInboxMessageContent.mediaIsGIF()) {
                    this.mediaLayout.setVisibility(0);
                    this.mediaImage.setVisibility(0);
                    this.mediaImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    try {
                        com.bumptech.glide.b.echo(this.mediaImage.getContext()).hotel().coral(cTInboxMessageContent.getMedia()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).foxtrot(Utils.getThumbnailImage(this.context, Constants.IMAGE_PLACEHOLDER))).azure(this.mediaImage);
                    } catch (NoSuchMethodError unused6) {
                        Logger.d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        com.bumptech.glide.b.echo(this.mediaImage.getContext()).hotel().coral(cTInboxMessageContent.getMedia()).azure(this.mediaImage);
                    }
                    Resources resources22 = this.context.getResources();
                    if (CTInboxActivity.orientation == 2) {
                    }
                    this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i5, i10));
                    markItemAsRead(cTInboxMessage, i4);
                    if (parent != null) {
                    }
                } else {
                    if (cTInboxMessageContent.mediaIsVideo()) {
                        if (!cTInboxMessageContent.getPosterUrl().isEmpty()) {
                            this.mediaLayout.setVisibility(0);
                            this.mediaImage.setVisibility(0);
                            this.mediaImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            try {
                                com.bumptech.glide.b.echo(this.mediaImage.getContext()).quebec(cTInboxMessageContent.getPosterUrl()).alpha(((g) new g().lima(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).foxtrot(Utils.getThumbnailImage(this.context, Constants.VIDEO_THUMBNAIL))).azure(this.mediaImage);
                            } catch (NoSuchMethodError unused7) {
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
                    Resources resources222 = this.context.getResources();
                    if (CTInboxActivity.orientation == 2) {
                    }
                    this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i5, i10));
                    markItemAsRead(cTInboxMessage, i4);
                    if (parent != null) {
                    }
                }
            }
            z2 = -1;
            if (!z2) {
            }
        } else {
            if (orientation.equals("l")) {
                z2 = false;
                if (!z2) {
                }
            }
            z2 = -1;
            if (!z2) {
            }
        }
        Logger.d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        Resources resources2222 = this.context.getResources();
        if (CTInboxActivity.orientation == 2) {
        }
        this.progressBarFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(i5, i10));
        markItemAsRead(cTInboxMessage, i4);
        if (parent != null) {
        }
    }
}
