package io.confluent.connect.jdbc.sink;

import org.apache.kafka.connect.errors.ConnectException;
import org.apache.kafka.connect.sink.SinkRecord;

public class SendToDLQException extends ConnectException  {
  private Throwable e;
  private SinkRecord record;

  public SendToDLQException(Throwable e, SinkRecord record) {
    super(e);
    this.e = e;
    this.record = record;
  }

  public Throwable getThrowable() {
    return e;
  }

  public SinkRecord getRecord() {
    return record;
  }
}
