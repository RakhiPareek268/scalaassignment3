class Log {
  def log(message:String, level:String="INFO"): String ={
    (s"[$level]:$message")
  }
}


