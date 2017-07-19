/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_info {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected peer_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public piece_index_bitfield getPieces() {
    long cPtr = libtorrent_jni.peer_info_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new piece_index_bitfield(cPtr, false);
  }

  public long getTotal_download() {
    return libtorrent_jni.peer_info_total_download_get(swigCPtr, this);
  }

  public long getTotal_upload() {
    return libtorrent_jni.peer_info_total_upload_get(swigCPtr, this);
  }

  static public class peer_flags {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected peer_flags(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(peer_flags obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          throw new UnsupportedOperationException("C++ destructor does not have public access");
        }
        swigCPtr = 0;
      }
    }
  
    public final static int interesting = 0x1;
    public final static int choked = 0x2;
    public final static int remote_interested = 0x4;
    public final static int remote_choked = 0x8;
    public final static int supports_extensions = 0x10;
    public final static int local_connection = 0x20;
    public final static int handshake = 0x40;
    public final static int connecting = 0x80;
    public final static int on_parole = 0x200;
    public final static int seed = 0x400;
    public final static int optimistic_unchoke = 0x800;
    public final static int snubbed = 0x1000;
    public final static int upload_only = 0x2000;
    public final static int endgame_mode = 0x4000;
    public final static int holepunched = 0x8000;
    public final static int i2p_socket = 0x10000;
    public final static int utp_socket = 0x20000;
    public final static int ssl_socket = 0x40000;
    public final static int rc4_encrypted = 0x100000;
    public final static int plaintext_encrypted = 0x200000;
  }

  static public class peer_source_flags {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected peer_source_flags(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(peer_source_flags obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          throw new UnsupportedOperationException("C++ destructor does not have public access");
        }
        swigCPtr = 0;
      }
    }
  
    public final static byte tracker = 0x1;
    public final static byte dht = 0x2;
    public final static byte pex = 0x4;
    public final static byte lsd = 0x8;
    public final static byte resume_data = 0x10;
    public final static byte incoming = 0x20;
  }

  public int getUp_speed() {
    return libtorrent_jni.peer_info_up_speed_get(swigCPtr, this);
  }

  public int getDown_speed() {
    return libtorrent_jni.peer_info_down_speed_get(swigCPtr, this);
  }

  public int getPayload_up_speed() {
    return libtorrent_jni.peer_info_payload_up_speed_get(swigCPtr, this);
  }

  public int getPayload_down_speed() {
    return libtorrent_jni.peer_info_payload_down_speed_get(swigCPtr, this);
  }

  public sha1_hash getPid() {
    long cPtr = libtorrent_jni.peer_info_pid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public int getQueue_bytes() {
    return libtorrent_jni.peer_info_queue_bytes_get(swigCPtr, this);
  }

  public int getRequest_timeout() {
    return libtorrent_jni.peer_info_request_timeout_get(swigCPtr, this);
  }

  public int getSend_buffer_size() {
    return libtorrent_jni.peer_info_send_buffer_size_get(swigCPtr, this);
  }

  public int getUsed_send_buffer() {
    return libtorrent_jni.peer_info_used_send_buffer_get(swigCPtr, this);
  }

  public int getReceive_buffer_size() {
    return libtorrent_jni.peer_info_receive_buffer_size_get(swigCPtr, this);
  }

  public int getUsed_receive_buffer() {
    return libtorrent_jni.peer_info_used_receive_buffer_get(swigCPtr, this);
  }

  public int getReceive_buffer_watermark() {
    return libtorrent_jni.peer_info_receive_buffer_watermark_get(swigCPtr, this);
  }

  public int getNum_hashfails() {
    return libtorrent_jni.peer_info_num_hashfails_get(swigCPtr, this);
  }

  public int getDownload_queue_length() {
    return libtorrent_jni.peer_info_download_queue_length_get(swigCPtr, this);
  }

  public int getTimed_out_requests() {
    return libtorrent_jni.peer_info_timed_out_requests_get(swigCPtr, this);
  }

  public int getBusy_requests() {
    return libtorrent_jni.peer_info_busy_requests_get(swigCPtr, this);
  }

  public int getRequests_in_buffer() {
    return libtorrent_jni.peer_info_requests_in_buffer_get(swigCPtr, this);
  }

  public int getTarget_dl_queue_length() {
    return libtorrent_jni.peer_info_target_dl_queue_length_get(swigCPtr, this);
  }

  public int getUpload_queue_length() {
    return libtorrent_jni.peer_info_upload_queue_length_get(swigCPtr, this);
  }

  public int getFailcount() {
    return libtorrent_jni.peer_info_failcount_get(swigCPtr, this);
  }

  public int getDownloading_piece_index() {
    return libtorrent_jni.peer_info_downloading_piece_index_get(swigCPtr, this);
  }

  public int getDownloading_block_index() {
    return libtorrent_jni.peer_info_downloading_block_index_get(swigCPtr, this);
  }

  public int getDownloading_progress() {
    return libtorrent_jni.peer_info_downloading_progress_get(swigCPtr, this);
  }

  public int getDownloading_total() {
    return libtorrent_jni.peer_info_downloading_total_get(swigCPtr, this);
  }

  public int getConnection_type() {
    return libtorrent_jni.peer_info_connection_type_get(swigCPtr, this);
  }

  public int getPending_disk_bytes() {
    return libtorrent_jni.peer_info_pending_disk_bytes_get(swigCPtr, this);
  }

  public int getPending_disk_read_bytes() {
    return libtorrent_jni.peer_info_pending_disk_read_bytes_get(swigCPtr, this);
  }

  public int getSend_quota() {
    return libtorrent_jni.peer_info_send_quota_get(swigCPtr, this);
  }

  public int getReceive_quota() {
    return libtorrent_jni.peer_info_receive_quota_get(swigCPtr, this);
  }

  public int getRtt() {
    return libtorrent_jni.peer_info_rtt_get(swigCPtr, this);
  }

  public int getNum_pieces() {
    return libtorrent_jni.peer_info_num_pieces_get(swigCPtr, this);
  }

  public int getDownload_rate_peak() {
    return libtorrent_jni.peer_info_download_rate_peak_get(swigCPtr, this);
  }

  public int getUpload_rate_peak() {
    return libtorrent_jni.peer_info_upload_rate_peak_get(swigCPtr, this);
  }

  public float getProgress() {
    return libtorrent_jni.peer_info_progress_get(swigCPtr, this);
  }

  public int getProgress_ppm() {
    return libtorrent_jni.peer_info_progress_ppm_get(swigCPtr, this);
  }

  public int getEstimated_reciprocation_rate() {
    return libtorrent_jni.peer_info_estimated_reciprocation_rate_get(swigCPtr, this);
  }

  public tcp_endpoint getIp() {
    long cPtr = libtorrent_jni.peer_info_ip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  public tcp_endpoint getLocal_endpoint() {
    long cPtr = libtorrent_jni.peer_info_local_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  static public class bandwidth_state_flags {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected bandwidth_state_flags(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(bandwidth_state_flags obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          throw new UnsupportedOperationException("C++ destructor does not have public access");
        }
        swigCPtr = 0;
      }
    }
  
    public final static byte bw_idle = 0;
    public final static byte bw_limit = 1;
    public final static byte bw_network = 2;
    public final static byte bw_disk = 4;
  }

  public byte_vector get_client() {
    return new byte_vector(libtorrent_jni.peer_info_get_client(swigCPtr, this), true);
  }

  public long get_last_request() {
    return libtorrent_jni.peer_info_get_last_request(swigCPtr, this);
  }

  public long get_last_active() {
    return libtorrent_jni.peer_info_get_last_active(swigCPtr, this);
  }

  public long get_download_queue_time() {
    return libtorrent_jni.peer_info_get_download_queue_time(swigCPtr, this);
  }

  public int get_flags() {
    return libtorrent_jni.peer_info_get_flags(swigCPtr, this);
  }

  public byte get_source() {
    return libtorrent_jni.peer_info_get_source(swigCPtr, this);
  }

  public byte get_read_state() {
    return libtorrent_jni.peer_info_get_read_state(swigCPtr, this);
  }

  public byte get_write_state() {
    return libtorrent_jni.peer_info_get_write_state(swigCPtr, this);
  }

  public peer_info() {
    this(libtorrent_jni.new_peer_info(), true);
  }

  public final static class connection_type_t {
    public final static peer_info.connection_type_t standard_bittorrent = new peer_info.connection_type_t("standard_bittorrent", libtorrent_jni.peer_info_standard_bittorrent_get());
    public final static peer_info.connection_type_t web_seed = new peer_info.connection_type_t("web_seed", libtorrent_jni.peer_info_web_seed_get());
    public final static peer_info.connection_type_t http_seed = new peer_info.connection_type_t("http_seed", libtorrent_jni.peer_info_http_seed_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static connection_type_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + connection_type_t.class + " with value " + swigValue);
    }

    private connection_type_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private connection_type_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private connection_type_t(String swigName, connection_type_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static connection_type_t[] swigValues = { standard_bittorrent, web_seed, http_seed };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
