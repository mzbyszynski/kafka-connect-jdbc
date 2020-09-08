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

import org.apache.kafka.connect.errors.ConnectException;
import java.util.List;

public class SendToDlqException extends ConnectException  {
  private List<ErrantRecord> errantRecords;

  public SendToDlqException(List<ErrantRecord> errantRecords) {
    super(errantRecords.get(0).getError());
    this.errantRecords = errantRecords;
  }

  public List<ErrantRecord> getErrantRecords() {
    return errantRecords;
  }

  public Throwable getInitialError() {
    return errantRecords.get(0).getError();
  }
}
