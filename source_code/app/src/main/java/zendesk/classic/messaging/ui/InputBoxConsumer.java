package zendesk.classic.messaging.ui;

import android.net.Uri;
import com.zendesk.util.StringUtils;
import java.util.List;
import zendesk.classic.messaging.EventFactory;
import zendesk.classic.messaging.EventListener;
import zendesk.classic.messaging.MediaInMemoryDataSource;
import zendesk.classic.messaging.MediaResolverCallback;
import zendesk.classic.messaging.MessagingActivityScope;
import zendesk.classic.messaging.UriResolver;
import zendesk.classic.messaging.ui.InputBox;

@MessagingActivityScope
/* loaded from: classes.dex */
public class InputBoxConsumer implements InputBox.InputTextConsumer {
    private final MediaResolverCallback callback;
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final MediaInMemoryDataSource mediaInMemoryDataSource;
    private final UriResolver uriResolver;

    public InputBoxConsumer(EventListener eventListener, EventFactory eventFactory, MediaInMemoryDataSource mediaInMemoryDataSource, UriResolver uriResolver, MediaResolverCallback mediaResolverCallback) {
        this.eventListener = eventListener;
        this.eventFactory = eventFactory;
        this.mediaInMemoryDataSource = mediaInMemoryDataSource;
        this.uriResolver = uriResolver;
        this.callback = mediaResolverCallback;
    }

    @Override // zendesk.classic.messaging.ui.InputBox.InputTextConsumer
    public boolean onConsumeText(String str) {
        if (StringUtils.hasLength(str)) {
            this.eventListener.onEvent(this.eventFactory.textInput(str));
        }
        List<Uri> selectedUris = this.mediaInMemoryDataSource.getSelectedUris();
        if (!selectedUris.isEmpty()) {
            this.uriResolver.start(selectedUris, this.callback);
            this.mediaInMemoryDataSource.clear();
            return true;
        }
        return true;
    }
}
