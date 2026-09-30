package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/app/network/network/models/Score;", "Lcom/app/network/network/models/Language;", "<init>", "()V", "weight", "", "getWeight", "()Ljava/lang/Integer;", "setWeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", Constants.KEY_KEY, "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", Constants.KEY_TITLE, "getTitle", "setTitle", "score", "", "getScore", "()Ljava/lang/Double;", "setScore", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "hexColor", "getHexColor", "setHexColor", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Score extends Language {

    @Nullable
    private String hexColor;

    @Nullable
    private String key;

    @Nullable
    private Double score;

    @Nullable
    private String title;

    @Nullable
    private Integer weight;

    public Score() {
        super(null, 1, null);
    }

    @Nullable
    public final String getHexColor() {
        return this.hexColor;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Double getScore() {
        return this.score;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    public final void setHexColor(@Nullable String str) {
        this.hexColor = str;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setScore(@Nullable Double d4) {
        this.score = d4;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setWeight(@Nullable Integer num) {
        this.weight = num;
    }
}
