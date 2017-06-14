/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.sync.sync;

import org.mozilla.sync.FirefoxSyncException;

/** Callback for when a sync collection request completes. */
interface OnSyncComplete<T> {
    void onSuccess(SyncCollectionResult<T> result);
    void onException(FirefoxSyncException e);
}
