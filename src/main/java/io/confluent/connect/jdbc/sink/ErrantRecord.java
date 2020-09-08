/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.connect.jdbc.sink;

import org.apache.kafka.connect.sink.SinkRecord;

public class ErrantRecord {
  private SinkRecord record;
  private Throwable error;

  public ErrantRecord(SinkRecord record, Throwable error) {
    this.record = record;
    this.error = error;
  }

  public SinkRecord getRecord() {
    return record;
  }

  public Throwable getError() {
    return error;
  }
}
