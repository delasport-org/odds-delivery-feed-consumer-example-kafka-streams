/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package models.avro.wager.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class Score extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1901575692763658348L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Score\",\"namespace\":\"models.avro\",\"fields\":[{\"name\":\"homeTeam\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"awayTeam\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Score> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Score> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Score> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Score> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Score> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Score to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Score from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Score instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Score fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private Integer homeTeam;
  private Integer awayTeam;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Score() {}

  /**
   * All-args constructor.
   * @param homeTeam The new value for homeTeam
   * @param awayTeam The new value for awayTeam
   */
  public Score(Integer homeTeam, Integer awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
  }

  @Override
  public SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return homeTeam;
    case 1: return awayTeam;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: homeTeam = (Integer)value$; break;
    case 1: awayTeam = (Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'homeTeam' field.
   * @return The value of the 'homeTeam' field.
   */
  public Integer getHomeTeam() {
    return homeTeam;
  }


  /**
   * Sets the value of the 'homeTeam' field.
   * @param value the value to set.
   */
  public void setHomeTeam(Integer value) {
    this.homeTeam = value;
  }

  /**
   * Gets the value of the 'awayTeam' field.
   * @return The value of the 'awayTeam' field.
   */
  public Integer getAwayTeam() {
    return awayTeam;
  }


  /**
   * Sets the value of the 'awayTeam' field.
   * @param value the value to set.
   */
  public void setAwayTeam(Integer value) {
    this.awayTeam = value;
  }

  /**
   * Creates a new Score RecordBuilder.
   * @return A new Score RecordBuilder
   */
  public static Score.Builder newBuilder() {
    return new Score.Builder();
  }

  /**
   * Creates a new Score RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Score RecordBuilder
   */
  public static Score.Builder newBuilder(Score.Builder other) {
    if (other == null) {
      return new Score.Builder();
    } else {
      return new Score.Builder(other);
    }
  }

  /**
   * Creates a new Score RecordBuilder by copying an existing Score instance.
   * @param other The existing instance to copy.
   * @return A new Score RecordBuilder
   */
  public static Score.Builder newBuilder(Score other) {
    if (other == null) {
      return new Score.Builder();
    } else {
      return new Score.Builder(other);
    }
  }

  /**
   * RecordBuilder for Score instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Score>
    implements org.apache.avro.data.RecordBuilder<Score> {

    private Integer homeTeam;
    private Integer awayTeam;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Score.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.homeTeam)) {
        this.homeTeam = data().deepCopy(fields()[0].schema(), other.homeTeam);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.awayTeam)) {
        this.awayTeam = data().deepCopy(fields()[1].schema(), other.awayTeam);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Score instance
     * @param other The existing instance to copy.
     */
    private Builder(Score other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.homeTeam)) {
        this.homeTeam = data().deepCopy(fields()[0].schema(), other.homeTeam);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.awayTeam)) {
        this.awayTeam = data().deepCopy(fields()[1].schema(), other.awayTeam);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'homeTeam' field.
      * @return The value.
      */
    public Integer getHomeTeam() {
      return homeTeam;
    }


    /**
      * Sets the value of the 'homeTeam' field.
      * @param value The value of 'homeTeam'.
      * @return This builder.
      */
    public Score.Builder setHomeTeam(Integer value) {
      validate(fields()[0], value);
      this.homeTeam = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'homeTeam' field has been set.
      * @return True if the 'homeTeam' field has been set, false otherwise.
      */
    public boolean hasHomeTeam() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'homeTeam' field.
      * @return This builder.
      */
    public Score.Builder clearHomeTeam() {
      homeTeam = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'awayTeam' field.
      * @return The value.
      */
    public Integer getAwayTeam() {
      return awayTeam;
    }


    /**
      * Sets the value of the 'awayTeam' field.
      * @param value The value of 'awayTeam'.
      * @return This builder.
      */
    public Score.Builder setAwayTeam(Integer value) {
      validate(fields()[1], value);
      this.awayTeam = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'awayTeam' field has been set.
      * @return True if the 'awayTeam' field has been set, false otherwise.
      */
    public boolean hasAwayTeam() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'awayTeam' field.
      * @return This builder.
      */
    public Score.Builder clearAwayTeam() {
      awayTeam = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Score build() {
      try {
        Score record = new Score();
        record.homeTeam = fieldSetFlags()[0] ? this.homeTeam : (Integer) defaultValue(fields()[0]);
        record.awayTeam = fieldSetFlags()[1] ? this.awayTeam : (Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Score>
    WRITER$ = (org.apache.avro.io.DatumWriter<Score>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Score>
    READER$ = (org.apache.avro.io.DatumReader<Score>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.homeTeam == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.homeTeam);
    }

    if (this.awayTeam == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.awayTeam);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.homeTeam = null;
      } else {
        this.homeTeam = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.awayTeam = null;
      } else {
        this.awayTeam = in.readInt();
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.homeTeam = null;
          } else {
            this.homeTeam = in.readInt();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.awayTeam = null;
          } else {
            this.awayTeam = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










