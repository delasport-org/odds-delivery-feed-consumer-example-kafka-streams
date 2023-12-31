/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package models.avro.wager.avro.wager;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Wager_currency extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -525181944960119292L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Wager_currency\",\"namespace\":\"models.avro.wager\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"exchangeRate\",\"type\":[\"null\",\"double\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Wager_currency> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Wager_currency> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Wager_currency> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Wager_currency> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Wager_currency> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Wager_currency to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Wager_currency from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Wager_currency instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Wager_currency fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private Integer id;
  private CharSequence name;
  private Double exchangeRate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Wager_currency() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param exchangeRate The new value for exchangeRate
   */
  public Wager_currency(Integer id, CharSequence name, Double exchangeRate) {
    this.id = id;
    this.name = name;
    this.exchangeRate = exchangeRate;
  }

  @Override
  public SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return exchangeRate;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: id = (Integer)value$; break;
    case 1: name = (CharSequence)value$; break;
    case 2: exchangeRate = (Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public Integer getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'exchangeRate' field.
   * @return The value of the 'exchangeRate' field.
   */
  public Double getExchangeRate() {
    return exchangeRate;
  }


  /**
   * Sets the value of the 'exchangeRate' field.
   * @param value the value to set.
   */
  public void setExchangeRate(Double value) {
    this.exchangeRate = value;
  }

  /**
   * Creates a new Wager_currency RecordBuilder.
   * @return A new Wager_currency RecordBuilder
   */
  public static Wager_currency.Builder newBuilder() {
    return new Wager_currency.Builder();
  }

  /**
   * Creates a new Wager_currency RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Wager_currency RecordBuilder
   */
  public static Wager_currency.Builder newBuilder(Wager_currency.Builder other) {
    if (other == null) {
      return new Wager_currency.Builder();
    } else {
      return new Wager_currency.Builder(other);
    }
  }

  /**
   * Creates a new Wager_currency RecordBuilder by copying an existing Wager_currency instance.
   * @param other The existing instance to copy.
   * @return A new Wager_currency RecordBuilder
   */
  public static Wager_currency.Builder newBuilder(Wager_currency other) {
    if (other == null) {
      return new Wager_currency.Builder();
    } else {
      return new Wager_currency.Builder(other);
    }
  }

  /**
   * RecordBuilder for Wager_currency instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Wager_currency>
    implements org.apache.avro.data.RecordBuilder<Wager_currency> {

    private Integer id;
    private CharSequence name;
    private Double exchangeRate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Wager_currency.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.exchangeRate)) {
        this.exchangeRate = data().deepCopy(fields()[2].schema(), other.exchangeRate);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Wager_currency instance
     * @param other The existing instance to copy.
     */
    private Builder(Wager_currency other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.exchangeRate)) {
        this.exchangeRate = data().deepCopy(fields()[2].schema(), other.exchangeRate);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public Integer getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public Wager_currency.Builder setId(Integer value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public Wager_currency.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public Wager_currency.Builder setName(CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public Wager_currency.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'exchangeRate' field.
      * @return The value.
      */
    public Double getExchangeRate() {
      return exchangeRate;
    }


    /**
      * Sets the value of the 'exchangeRate' field.
      * @param value The value of 'exchangeRate'.
      * @return This builder.
      */
    public Wager_currency.Builder setExchangeRate(Double value) {
      validate(fields()[2], value);
      this.exchangeRate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'exchangeRate' field has been set.
      * @return True if the 'exchangeRate' field has been set, false otherwise.
      */
    public boolean hasExchangeRate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'exchangeRate' field.
      * @return This builder.
      */
    public Wager_currency.Builder clearExchangeRate() {
      exchangeRate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Wager_currency build() {
      try {
        Wager_currency record = new Wager_currency();
        record.id = fieldSetFlags()[0] ? this.id : (Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (CharSequence) defaultValue(fields()[1]);
        record.exchangeRate = fieldSetFlags()[2] ? this.exchangeRate : (Double) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Wager_currency>
    WRITER$ = (org.apache.avro.io.DatumWriter<Wager_currency>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Wager_currency>
    READER$ = (org.apache.avro.io.DatumReader<Wager_currency>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.id);
    }

    if (this.name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.name);
    }

    if (this.exchangeRate == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.exchangeRate);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.exchangeRate = null;
      } else {
        this.exchangeRate = in.readDouble();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readInt();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.exchangeRate = null;
          } else {
            this.exchangeRate = in.readDouble();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










