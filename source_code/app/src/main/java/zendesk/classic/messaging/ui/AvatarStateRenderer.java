package zendesk.classic.messaging.ui;

import com.squareup.picasso.Picasso;
import com.zendesk.util.StringUtils;
import zendesk.classic.messaging.MessagingActivityScope;
import zendesk.classic.messaging.R;

@MessagingActivityScope
/* loaded from: classes.dex */
class AvatarStateRenderer {
    private static final int DEFAULT_AVATAR_DRAWABLE = R.drawable.zui_ic_default_avatar_16;
    private static final String LATIN_CHARACTER_REGEX = "[a-zA-Z]";
    private final Picasso picasso;

    public AvatarStateRenderer(Picasso picasso) {
        this.picasso = picasso;
    }

    public void render(AvatarState avatarState, AvatarView avatarView) {
        if (StringUtils.hasLength(avatarState.getAvatarUrl())) {
            avatarView.showImage(this.picasso, avatarState.getAvatarUrl());
            return;
        }
        if (avatarState.getAvatarRes() != null) {
            avatarView.showDrawable(avatarState.getAvatarRes().intValue());
        } else if (StringUtils.hasLength(avatarState.getAvatarLetter()) && avatarState.getAvatarLetter().matches(LATIN_CHARACTER_REGEX)) {
            avatarView.showLetter(avatarState.getAvatarLetter(), avatarState.getUniqueIdentifier());
        } else {
            avatarView.showDefault(DEFAULT_AVATAR_DRAWABLE, avatarState.getUniqueIdentifier());
        }
    }
}
