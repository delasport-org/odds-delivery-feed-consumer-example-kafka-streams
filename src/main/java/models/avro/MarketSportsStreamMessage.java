/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package models.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class MarketSportsStreamMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7274939548101594848L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MarketSportsStreamMessage\",\"namespace\":\"models.avro\",\"fields\":[{\"name\":\"origin\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Origin\",\"fields\":[{\"name\":\"stream\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"environment\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"eventInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventInfo\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"liveGamePeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LiveGamePeriod\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"liveMinute\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"marketsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"startDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timeRange\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Sport\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"key\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"country\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Country\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"league\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"League\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"format\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"teams\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Teams\",\"fields\":[{\"name\":\"home\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Team\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"color\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"away\",\"type\":[\"null\",\"Team\"],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"lineInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LineInfo\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"index\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"updatedAt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"marketType\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"MarketType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"lineEntity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LineEntity\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"gamePeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GamePeriod\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"isValid\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"spread\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"odds\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OddOddsHistory\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"key\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"isValid\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MarketSportsStreamMessage> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MarketSportsStreamMessage> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MarketSportsStreamMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MarketSportsStreamMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MarketSportsStreamMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MarketSportsStreamMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MarketSportsStreamMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MarketSportsStreamMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MarketSportsStreamMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private models.avro.Origin origin;
  private CharSequence id;
  private models.avro.EventInfo eventInfo;
  private models.avro.LineInfo lineInfo;
  private java.util.List<models.avro.OddOddsHistory> odds;
  private CharSequence timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MarketSportsStreamMessage() {}

  /**
   * All-args constructor.
   * @param origin The new value for origin
   * @param id The new value for id
   * @param eventInfo The new value for eventInfo
   * @param lineInfo The new value for lineInfo
   * @param odds The new value for odds
   * @param timestamp The new value for timestamp
   */
  public MarketSportsStreamMessage(models.avro.Origin origin, CharSequence id, models.avro.EventInfo eventInfo, models.avro.LineInfo lineInfo, java.util.List<models.avro.OddOddsHistory> odds, CharSequence timestamp) {
    this.origin = origin;
    this.id = id;
    this.eventInfo = eventInfo;
    this.lineInfo = lineInfo;
    this.odds = odds;
    this.timestamp = timestamp;
  }

  @Override
  public SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return origin;
    case 1: return id;
    case 2: return eventInfo;
    case 3: return lineInfo;
    case 4: return odds;
    case 5: return timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: origin = (models.avro.Origin)value$; break;
    case 1: id = (CharSequence)value$; break;
    case 2: eventInfo = (models.avro.EventInfo)value$; break;
    case 3: lineInfo = (models.avro.LineInfo)value$; break;
    case 4: odds = (java.util.List<models.avro.OddOddsHistory>)value$; break;
    case 5: timestamp = (CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'origin' field.
   * @return The value of the 'origin' field.
   */
  public models.avro.Origin getOrigin() {
    return origin;
  }


  /**
   * Sets the value of the 'origin' field.
   * @param value the value to set.
   */
  public void setOrigin(models.avro.Origin value) {
    this.origin = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'eventInfo' field.
   * @return The value of the 'eventInfo' field.
   */
  public models.avro.EventInfo getEventInfo() {
    return eventInfo;
  }


  /**
   * Sets the value of the 'eventInfo' field.
   * @param value the value to set.
   */
  public void setEventInfo(models.avro.EventInfo value) {
    this.eventInfo = value;
  }

  /**
   * Gets the value of the 'lineInfo' field.
   * @return The value of the 'lineInfo' field.
   */
  public models.avro.LineInfo getLineInfo() {
    return lineInfo;
  }


  /**
   * Sets the value of the 'lineInfo' field.
   * @param value the value to set.
   */
  public void setLineInfo(models.avro.LineInfo value) {
    this.lineInfo = value;
  }

  /**
   * Gets the value of the 'odds' field.
   * @return The value of the 'odds' field.
   */
  public java.util.List<models.avro.OddOddsHistory> getOdds() {
    return odds;
  }


  /**
   * Sets the value of the 'odds' field.
   * @param value the value to set.
   */
  public void setOdds(java.util.List<models.avro.OddOddsHistory> value) {
    this.odds = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public CharSequence getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Creates a new MarketSportsStreamMessage RecordBuilder.
   * @return A new MarketSportsStreamMessage RecordBuilder
   */
  public static models.avro.MarketSportsStreamMessage.Builder newBuilder() {
    return new models.avro.MarketSportsStreamMessage.Builder();
  }

  /**
   * Creates a new MarketSportsStreamMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MarketSportsStreamMessage RecordBuilder
   */
  public static models.avro.MarketSportsStreamMessage.Builder newBuilder(models.avro.MarketSportsStreamMessage.Builder other) {
    if (other == null) {
      return new models.avro.MarketSportsStreamMessage.Builder();
    } else {
      return new models.avro.MarketSportsStreamMessage.Builder(other);
    }
  }

  /**
   * Creates a new MarketSportsStreamMessage RecordBuilder by copying an existing MarketSportsStreamMessage instance.
   * @param other The existing instance to copy.
   * @return A new MarketSportsStreamMessage RecordBuilder
   */
  public static models.avro.MarketSportsStreamMessage.Builder newBuilder(models.avro.MarketSportsStreamMessage other) {
    if (other == null) {
      return new models.avro.MarketSportsStreamMessage.Builder();
    } else {
      return new models.avro.MarketSportsStreamMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for MarketSportsStreamMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MarketSportsStreamMessage>
    implements org.apache.avro.data.RecordBuilder<MarketSportsStreamMessage> {

    private models.avro.Origin origin;
    private models.avro.Origin.Builder originBuilder;
    private CharSequence id;
    private models.avro.EventInfo eventInfo;
    private models.avro.EventInfo.Builder eventInfoBuilder;
    private models.avro.LineInfo lineInfo;
    private models.avro.LineInfo.Builder lineInfoBuilder;
    private java.util.List<models.avro.OddOddsHistory> odds;
    private CharSequence timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(models.avro.MarketSportsStreamMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.origin)) {
        this.origin = data().deepCopy(fields()[0].schema(), other.origin);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasOriginBuilder()) {
        this.originBuilder = models.avro.Origin.newBuilder(other.getOriginBuilder());
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.eventInfo)) {
        this.eventInfo = data().deepCopy(fields()[2].schema(), other.eventInfo);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasEventInfoBuilder()) {
        this.eventInfoBuilder = models.avro.EventInfo.newBuilder(other.getEventInfoBuilder());
      }
      if (isValidValue(fields()[3], other.lineInfo)) {
        this.lineInfo = data().deepCopy(fields()[3].schema(), other.lineInfo);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasLineInfoBuilder()) {
        this.lineInfoBuilder = models.avro.LineInfo.newBuilder(other.getLineInfoBuilder());
      }
      if (isValidValue(fields()[4], other.odds)) {
        this.odds = data().deepCopy(fields()[4].schema(), other.odds);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing MarketSportsStreamMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(models.avro.MarketSportsStreamMessage other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.origin)) {
        this.origin = data().deepCopy(fields()[0].schema(), other.origin);
        fieldSetFlags()[0] = true;
      }
      this.originBuilder = null;
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventInfo)) {
        this.eventInfo = data().deepCopy(fields()[2].schema(), other.eventInfo);
        fieldSetFlags()[2] = true;
      }
      this.eventInfoBuilder = null;
      if (isValidValue(fields()[3], other.lineInfo)) {
        this.lineInfo = data().deepCopy(fields()[3].schema(), other.lineInfo);
        fieldSetFlags()[3] = true;
      }
      this.lineInfoBuilder = null;
      if (isValidValue(fields()[4], other.odds)) {
        this.odds = data().deepCopy(fields()[4].schema(), other.odds);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'origin' field.
      * @return The value.
      */
    public models.avro.Origin getOrigin() {
      return origin;
    }


    /**
      * Sets the value of the 'origin' field.
      * @param value The value of 'origin'.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder setOrigin(models.avro.Origin value) {
      validate(fields()[0], value);
      this.originBuilder = null;
      this.origin = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'origin' field has been set.
      * @return True if the 'origin' field has been set, false otherwise.
      */
    public boolean hasOrigin() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'origin' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.Origin.Builder getOriginBuilder() {
      if (originBuilder == null) {
        if (hasOrigin()) {
          setOriginBuilder(models.avro.Origin.newBuilder(origin));
        } else {
          setOriginBuilder(models.avro.Origin.newBuilder());
        }
      }
      return originBuilder;
    }

    /**
     * Sets the Builder instance for the 'origin' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.MarketSportsStreamMessage.Builder setOriginBuilder(models.avro.Origin.Builder value) {
      clearOrigin();
      originBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'origin' field has an active Builder instance
     * @return True if the 'origin' field has an active Builder instance
     */
    public boolean hasOriginBuilder() {
      return originBuilder != null;
    }

    /**
      * Clears the value of the 'origin' field.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder clearOrigin() {
      origin = null;
      originBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder setId(CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventInfo' field.
      * @return The value.
      */
    public models.avro.EventInfo getEventInfo() {
      return eventInfo;
    }


    /**
      * Sets the value of the 'eventInfo' field.
      * @param value The value of 'eventInfo'.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder setEventInfo(models.avro.EventInfo value) {
      validate(fields()[2], value);
      this.eventInfoBuilder = null;
      this.eventInfo = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventInfo' field has been set.
      * @return True if the 'eventInfo' field has been set, false otherwise.
      */
    public boolean hasEventInfo() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'eventInfo' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.EventInfo.Builder getEventInfoBuilder() {
      if (eventInfoBuilder == null) {
        if (hasEventInfo()) {
          setEventInfoBuilder(models.avro.EventInfo.newBuilder(eventInfo));
        } else {
          setEventInfoBuilder(models.avro.EventInfo.newBuilder());
        }
      }
      return eventInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'eventInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.MarketSportsStreamMessage.Builder setEventInfoBuilder(models.avro.EventInfo.Builder value) {
      clearEventInfo();
      eventInfoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'eventInfo' field has an active Builder instance
     * @return True if the 'eventInfo' field has an active Builder instance
     */
    public boolean hasEventInfoBuilder() {
      return eventInfoBuilder != null;
    }

    /**
      * Clears the value of the 'eventInfo' field.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder clearEventInfo() {
      eventInfo = null;
      eventInfoBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lineInfo' field.
      * @return The value.
      */
    public models.avro.LineInfo getLineInfo() {
      return lineInfo;
    }


    /**
      * Sets the value of the 'lineInfo' field.
      * @param value The value of 'lineInfo'.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder setLineInfo(models.avro.LineInfo value) {
      validate(fields()[3], value);
      this.lineInfoBuilder = null;
      this.lineInfo = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lineInfo' field has been set.
      * @return True if the 'lineInfo' field has been set, false otherwise.
      */
    public boolean hasLineInfo() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'lineInfo' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.LineInfo.Builder getLineInfoBuilder() {
      if (lineInfoBuilder == null) {
        if (hasLineInfo()) {
          setLineInfoBuilder(models.avro.LineInfo.newBuilder(lineInfo));
        } else {
          setLineInfoBuilder(models.avro.LineInfo.newBuilder());
        }
      }
      return lineInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'lineInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.MarketSportsStreamMessage.Builder setLineInfoBuilder(models.avro.LineInfo.Builder value) {
      clearLineInfo();
      lineInfoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'lineInfo' field has an active Builder instance
     * @return True if the 'lineInfo' field has an active Builder instance
     */
    public boolean hasLineInfoBuilder() {
      return lineInfoBuilder != null;
    }

    /**
      * Clears the value of the 'lineInfo' field.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder clearLineInfo() {
      lineInfo = null;
      lineInfoBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'odds' field.
      * @return The value.
      */
    public java.util.List<models.avro.OddOddsHistory> getOdds() {
      return odds;
    }


    /**
      * Sets the value of the 'odds' field.
      * @param value The value of 'odds'.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder setOdds(java.util.List<models.avro.OddOddsHistory> value) {
      validate(fields()[4], value);
      this.odds = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'odds' field has been set.
      * @return True if the 'odds' field has been set, false otherwise.
      */
    public boolean hasOdds() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'odds' field.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder clearOdds() {
      odds = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public CharSequence getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder setTimestamp(CharSequence value) {
      validate(fields()[5], value);
      this.timestamp = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public models.avro.MarketSportsStreamMessage.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MarketSportsStreamMessage build() {
      try {
        MarketSportsStreamMessage record = new MarketSportsStreamMessage();
        if (originBuilder != null) {
          try {
            record.origin = this.originBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("origin"));
            throw e;
          }
        } else {
          record.origin = fieldSetFlags()[0] ? this.origin : (models.avro.Origin) defaultValue(fields()[0]);
        }
        record.id = fieldSetFlags()[1] ? this.id : (CharSequence) defaultValue(fields()[1]);
        if (eventInfoBuilder != null) {
          try {
            record.eventInfo = this.eventInfoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("eventInfo"));
            throw e;
          }
        } else {
          record.eventInfo = fieldSetFlags()[2] ? this.eventInfo : (models.avro.EventInfo) defaultValue(fields()[2]);
        }
        if (lineInfoBuilder != null) {
          try {
            record.lineInfo = this.lineInfoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("lineInfo"));
            throw e;
          }
        } else {
          record.lineInfo = fieldSetFlags()[3] ? this.lineInfo : (models.avro.LineInfo) defaultValue(fields()[3]);
        }
        record.odds = fieldSetFlags()[4] ? this.odds : (java.util.List<models.avro.OddOddsHistory>) defaultValue(fields()[4]);
        record.timestamp = fieldSetFlags()[5] ? this.timestamp : (CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MarketSportsStreamMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<MarketSportsStreamMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MarketSportsStreamMessage>
    READER$ = (org.apache.avro.io.DatumReader<MarketSportsStreamMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.origin == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.origin.customEncode(out);
    }

    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.eventInfo == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.eventInfo.customEncode(out);
    }

    if (this.lineInfo == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.lineInfo.customEncode(out);
    }

    if (this.odds == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.odds.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (models.avro.OddOddsHistory e0: this.odds) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    if (this.timestamp == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.timestamp);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.origin = null;
      } else {
        if (this.origin == null) {
          this.origin = new models.avro.Origin();
        }
        this.origin.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.eventInfo = null;
      } else {
        if (this.eventInfo == null) {
          this.eventInfo = new models.avro.EventInfo();
        }
        this.eventInfo.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.lineInfo = null;
      } else {
        if (this.lineInfo == null) {
          this.lineInfo = new models.avro.LineInfo();
        }
        this.lineInfo.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.odds = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<models.avro.OddOddsHistory> a0 = this.odds;
        if (a0 == null) {
          a0 = new SpecificData.Array<models.avro.OddOddsHistory>((int)size0, SCHEMA$.getField("odds").schema().getTypes().get(1));
          this.odds = a0;
        } else a0.clear();
        SpecificData.Array<models.avro.OddOddsHistory> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<models.avro.OddOddsHistory>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            models.avro.OddOddsHistory e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new models.avro.OddOddsHistory();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.timestamp = null;
      } else {
        this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.origin = null;
          } else {
            if (this.origin == null) {
              this.origin = new models.avro.Origin();
            }
            this.origin.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.eventInfo = null;
          } else {
            if (this.eventInfo == null) {
              this.eventInfo = new models.avro.EventInfo();
            }
            this.eventInfo.customDecode(in);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.lineInfo = null;
          } else {
            if (this.lineInfo == null) {
              this.lineInfo = new models.avro.LineInfo();
            }
            this.lineInfo.customDecode(in);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.odds = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<models.avro.OddOddsHistory> a0 = this.odds;
            if (a0 == null) {
              a0 = new SpecificData.Array<models.avro.OddOddsHistory>((int)size0, SCHEMA$.getField("odds").schema().getTypes().get(1));
              this.odds = a0;
            } else a0.clear();
            SpecificData.Array<models.avro.OddOddsHistory> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<models.avro.OddOddsHistory>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                models.avro.OddOddsHistory e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new models.avro.OddOddsHistory();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
            }
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.timestamp = null;
          } else {
            this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










