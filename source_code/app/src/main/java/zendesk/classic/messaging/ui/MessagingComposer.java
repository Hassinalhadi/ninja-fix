package zendesk.classic.messaging.ui;

import android.text.Editable;
import android.view.View;
import androidx.appcompat.app.i;
import androidx.lifecycle.A;
import com.zendesk.util.StringUtils;
import zendesk.classic.messaging.AttachmentSettings;
import zendesk.classic.messaging.MediaInMemoryDataSource;
import zendesk.classic.messaging.MessagingActivityScope;
import zendesk.classic.messaging.MessagingViewModel;
import zendesk.classic.messaging.R;
import zendesk.classic.messaging.TypingEventDispatcher;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.commonui.TextWatcherAdapter;

@MessagingActivityScope
/* loaded from: classes.dex */
public class MessagingComposer {
    static final int DEFAULT_HINT = R.string.zui_hint_type_message;
    private final i activity;
    private final InputBoxConsumer inputBoxConsumer;
    private final MediaInMemoryDataSource mediaInMemoryDataSource;
    private final TypingEventDispatcher typingEventDispatcher;
    private final MessagingViewModel viewModel;

    public MessagingComposer(i iVar, MessagingViewModel messagingViewModel, MediaInMemoryDataSource mediaInMemoryDataSource, InputBoxConsumer inputBoxConsumer, TypingEventDispatcher typingEventDispatcher) {
        this.activity = iVar;
        this.viewModel = messagingViewModel;
        this.mediaInMemoryDataSource = mediaInMemoryDataSource;
        this.inputBoxConsumer = inputBoxConsumer;
        this.typingEventDispatcher = typingEventDispatcher;
    }

    public void bind(final InputBox inputBox, final BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        inputBox.setInputTextConsumer(this.inputBoxConsumer);
        inputBox.setInputTextWatcher(new TextWatcherAdapter() { // from class: zendesk.classic.messaging.ui.MessagingComposer.1
            @Override // zendesk.commonui.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                MessagingComposer.this.typingEventDispatcher.onTyping();
            }
        });
        inputBox.setAttachmentsCount(this.mediaInMemoryDataSource.getCount().intValue());
        this.viewModel.getLiveMessagingState().observe(this.activity, new A() { // from class: zendesk.classic.messaging.ui.MessagingComposer.2
            @Override // androidx.lifecycle.A
            public void onChanged(MessagingState messagingState) {
                MessagingComposer.this.renderState(messagingState, inputBox, bottomSheetAttachmentViewMenu);
            }
        });
    }

    public void renderState(MessagingState messagingState, InputBox inputBox, final BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        String string;
        if (messagingState != null) {
            if (StringUtils.hasLength(messagingState.hint)) {
                string = messagingState.hint;
            } else {
                string = this.activity.getString(DEFAULT_HINT);
            }
            inputBox.setHint(string);
            inputBox.setEnabled(messagingState.enabled);
            inputBox.setInputType(Integer.valueOf(messagingState.keyboardInputType));
            AttachmentSettings attachmentSettings = messagingState.attachmentSettings;
            if (attachmentSettings != null && attachmentSettings.isSendingEnabled()) {
                inputBox.setAttachmentsIndicatorClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.MessagingComposer.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        bottomSheetAttachmentViewMenu.showMenu();
                        MessagingComposer.this.viewModel.setCounterValue(0);
                        MessagingComposer.this.mediaInMemoryDataSource.clear();
                    }
                });
                inputBox.setAttachmentsCount(this.mediaInMemoryDataSource.getCount().intValue());
            } else {
                inputBox.setAttachmentsIndicatorClickListener(null);
            }
        }
    }
}
