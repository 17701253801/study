import http from 'k6/http';
import { sleep } from 'k6';

export default function() {
  http.get('https://bbc.taikang.com/tkp-agent-web/');
  sleep(1);
}
