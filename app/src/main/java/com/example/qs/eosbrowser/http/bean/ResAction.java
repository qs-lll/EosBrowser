package com.example.qs.eosbrowser.http.bean;

import com.google.gson.JsonObject;

import java.util.List;

public class ResAction {

    /**
     * actions : [{"global_action_seq":25049,"account_action_seq":67,"block_num":24899,"block_time":"2018-11-01T12:46:08.000","action_trace":{"receipt":{"receiver":"zebra","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":25049,"recv_sequence":36,"auth_sequence":[["q",60]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":5643,"cpu_usage":0,"console":"\nooo1.0000 OOO\n ppp0.5000 BET\n-1730281844?24897","total_cpu_usage":0,"trx_id":"aeb345565b807439c5477ac90b0cf5dfccf9d40d837a0ce9b0de835509f5fce6","inline_traces":[]}},{"global_action_seq":25060,"account_action_seq":68,"block_num":24909,"block_time":"2018-11-01T12:46:13.000","action_trace":{"receipt":{"receiver":"zebra","act_digest":"183fe16e24f4c6f712bfa5dab5d9397ea2ae756c6346cc00ecdf41dd397fd054","global_sequence":25060,"recv_sequence":37,"auth_sequence":[["q",61]],"code_sequence":10,"abi_sequence":10},"act":{"account":"zebra","name":"dice","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","amount":"0.5000 BET","memo":50},"hex_data":"00000000000000b0881300000000000004424554000000003200000000000000"},"elapsed":523,"cpu_usage":0,"console":"q////0.5000 BET|||50\n///0.5000 BET\n ppp0.5000 BET65","total_cpu_usage":0,"trx_id":"b48922cb15405a112fd9beb536f20ffc057e087dd695d16e1dcc1408e3c6de4a","inline_traces":[]}},{"global_action_seq":26175,"account_action_seq":69,"block_num":26021,"block_time":"2018-11-01T12:55:29.000","action_trace":{"receipt":{"receiver":"eosio.token","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26175,"recv_sequence":43,"auth_sequence":[["q",62]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":385,"cpu_usage":0,"console":"","total_cpu_usage":0,"trx_id":"a466402f3114c585b510fc93f8458a4cf31e5f7ceff30f973ef12e59d051d707","inline_traces":[{"receipt":{"receiver":"q","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26176,"recv_sequence":29,"auth_sequence":[["q",63]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":42,"cpu_usage":0,"console":"","total_cpu_usage":0,"trx_id":"a466402f3114c585b510fc93f8458a4cf31e5f7ceff30f973ef12e59d051d707","inline_traces":[]},{"receipt":{"receiver":"zebra","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26177,"recv_sequence":38,"auth_sequence":[["q",64]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":4841,"cpu_usage":0,"console":"\nooo1.0000 OOO\n ppp0.5000 BET\n1468602149?26019","total_cpu_usage":0,"trx_id":"a466402f3114c585b510fc93f8458a4cf31e5f7ceff30f973ef12e59d051d707","inline_traces":[]}]}},{"global_action_seq":26176,"account_action_seq":70,"block_num":26021,"block_time":"2018-11-01T12:55:29.000","action_trace":{"receipt":{"receiver":"q","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26176,"recv_sequence":29,"auth_sequence":[["q",63]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":42,"cpu_usage":0,"console":"","total_cpu_usage":0,"trx_id":"a466402f3114c585b510fc93f8458a4cf31e5f7ceff30f973ef12e59d051d707","inline_traces":[]}},{"global_action_seq":26177,"account_action_seq":71,"block_num":26021,"block_time":"2018-11-01T12:55:29.000","action_trace":{"receipt":{"receiver":"zebra","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26177,"recv_sequence":38,"auth_sequence":[["q",64]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":4841,"cpu_usage":0,"console":"\nooo1.0000 OOO\n ppp0.5000 BET\n1468602149?26019","total_cpu_usage":0,"trx_id":"a466402f3114c585b510fc93f8458a4cf31e5f7ceff30f973ef12e59d051d707","inline_traces":[]}},{"global_action_seq":26188,"account_action_seq":72,"block_num":26031,"block_time":"2018-11-01T12:55:34.000","action_trace":{"receipt":{"receiver":"zebra","act_digest":"183fe16e24f4c6f712bfa5dab5d9397ea2ae756c6346cc00ecdf41dd397fd054","global_sequence":26188,"recv_sequence":39,"auth_sequence":[["q",65]],"code_sequence":11,"abi_sequence":11},"act":{"account":"zebra","name":"dice","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","amount":"0.5000 BET","memo":50},"hex_data":"00000000000000b0881300000000000004424554000000003200000000000000"},"elapsed":512,"cpu_usage":0,"console":"q////0.5000 BET|||50\n///0.5000 BET\n ppp0.5000 BET66","total_cpu_usage":0,"trx_id":"12346cfa336498b903dccfd9549282d5ec58b272ba25593b27dc66135e7531a1","inline_traces":[]}},{"global_action_seq":26262,"account_action_seq":73,"block_num":26102,"block_time":"2018-11-01T12:56:09.500","action_trace":{"receipt":{"receiver":"eosio.token","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26262,"recv_sequence":44,"auth_sequence":[["q",66]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":462,"cpu_usage":0,"console":"","total_cpu_usage":0,"trx_id":"809633c836033611c2e61f3640c0008b2b564b92d0de2859cd56fb71b1c2b23a","inline_traces":[{"receipt":{"receiver":"q","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26263,"recv_sequence":30,"auth_sequence":[["q",67]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":51,"cpu_usage":0,"console":"","total_cpu_usage":0,"trx_id":"809633c836033611c2e61f3640c0008b2b564b92d0de2859cd56fb71b1c2b23a","inline_traces":[]},{"receipt":{"receiver":"zebra","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26264,"recv_sequence":40,"auth_sequence":[["q",68]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":5932,"cpu_usage":0,"console":"\nooo1.0000 OOO\n ppp0.5000 BET\n-1257488995?26100","total_cpu_usage":0,"trx_id":"809633c836033611c2e61f3640c0008b2b564b92d0de2859cd56fb71b1c2b23a","inline_traces":[]}]}},{"global_action_seq":26263,"account_action_seq":74,"block_num":26102,"block_time":"2018-11-01T12:56:09.500","action_trace":{"receipt":{"receiver":"q","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26263,"recv_sequence":30,"auth_sequence":[["q",67]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":51,"cpu_usage":0,"console":"","total_cpu_usage":0,"trx_id":"809633c836033611c2e61f3640c0008b2b564b92d0de2859cd56fb71b1c2b23a","inline_traces":[]}},{"global_action_seq":26264,"account_action_seq":75,"block_num":26102,"block_time":"2018-11-01T12:56:09.500","action_trace":{"receipt":{"receiver":"zebra","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":26264,"recv_sequence":40,"auth_sequence":[["q",68]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":5932,"cpu_usage":0,"console":"\nooo1.0000 OOO\n ppp0.5000 BET\n-1257488995?26100","total_cpu_usage":0,"trx_id":"809633c836033611c2e61f3640c0008b2b564b92d0de2859cd56fb71b1c2b23a","inline_traces":[]}},{"global_action_seq":26275,"account_action_seq":76,"block_num":26112,"block_time":"2018-11-01T12:56:14.500","action_trace":{"receipt":{"receiver":"zebra","act_digest":"183fe16e24f4c6f712bfa5dab5d9397ea2ae756c6346cc00ecdf41dd397fd054","global_sequence":26275,"recv_sequence":41,"auth_sequence":[["q",69]],"code_sequence":12,"abi_sequence":12},"act":{"account":"zebra","name":"dice","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","amount":"0.5000 BET","memo":50},"hex_data":"00000000000000b0881300000000000004424554000000003200000000000000"},"elapsed":407,"cpu_usage":0,"console":"q////0.5000 BET|||50\n///0.5000 BET\n ppp0.5000 BET61receipt!!!!!!!!!!!!!!1","total_cpu_usage":0,"trx_id":"2e3f3ec78940d264f6e6689533f73f0114ec97d7b288ee477a6e415ff5fff5a1","inline_traces":[]}}]
     * last_irreversible_block : 26157
     */

    private int last_irreversible_block;
    private List<ActionsBean> actions;

    public int getLast_irreversible_block() {
        return last_irreversible_block;
    }

    public void setLast_irreversible_block(int last_irreversible_block) {
        this.last_irreversible_block = last_irreversible_block;
    }

    public List<ActionsBean> getActions() {
        return actions;
    }

    public void setActions(List<ActionsBean> actions) {
        this.actions = actions;
    }

    public static class ActionsBean {
        /**
         * global_action_seq : 25049
         * account_action_seq : 67
         * block_num : 24899
         * block_time : 2018-11-01T12:46:08.000
         * action_trace : {"receipt":{"receiver":"zebra","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":25049,"recv_sequence":36,"auth_sequence":[["q",60]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"},"elapsed":5643,"cpu_usage":0,"console":"\nooo1.0000 OOO\n ppp0.5000 BET\n-1730281844?24897","total_cpu_usage":0,"trx_id":"aeb345565b807439c5477ac90b0cf5dfccf9d40d837a0ce9b0de835509f5fce6","inline_traces":[]}
         */

        private int global_action_seq;
        private int account_action_seq;
        private int block_num;
        private String block_time;
        private ActionTraceBean action_trace;

        public int getGlobal_action_seq() {
            return global_action_seq;
        }

        public void setGlobal_action_seq(int global_action_seq) {
            this.global_action_seq = global_action_seq;
        }

        public int getAccount_action_seq() {
            return account_action_seq;
        }

        public void setAccount_action_seq(int account_action_seq) {
            this.account_action_seq = account_action_seq;
        }

        public int getBlock_num() {
            return block_num;
        }

        public void setBlock_num(int block_num) {
            this.block_num = block_num;
        }

        public String getBlock_time() {
            return block_time;
        }

        public void setBlock_time(String block_time) {
            this.block_time = block_time;
        }

        public ActionTraceBean getAction_trace() {
            return action_trace;
        }

        public void setAction_trace(ActionTraceBean action_trace) {
            this.action_trace = action_trace;
        }

        public static class ActionTraceBean {
            /**
             * receipt : {"receiver":"zebra","act_digest":"f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc","global_sequence":25049,"recv_sequence":36,"auth_sequence":[["q",60]],"code_sequence":1,"abi_sequence":1}
             * act : {"account":"eosio.token","name":"transfer","authorization":[{"actor":"q","permission":"active"}],"data":{"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"},"hex_data":"00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f"}
             * elapsed : 5643
             * cpu_usage : 0
             * console :
             ooo1.0000 OOO
             ppp0.5000 BET
             -1730281844?24897
             * total_cpu_usage : 0
             * trx_id : aeb345565b807439c5477ac90b0cf5dfccf9d40d837a0ce9b0de835509f5fce6
             * inline_traces : []
             */

            private ReceiptBean receipt;
            private ActBean act;
            private int elapsed;
            private int cpu_usage;
            private String console;
            private int total_cpu_usage;
            private String trx_id;
            private List<?> inline_traces;

            public ReceiptBean getReceipt() {
                return receipt;
            }

            public void setReceipt(ReceiptBean receipt) {
                this.receipt = receipt;
            }

            public ActBean getAct() {
                return act;
            }

            public void setAct(ActBean act) {
                this.act = act;
            }

            public int getElapsed() {
                return elapsed;
            }

            public void setElapsed(int elapsed) {
                this.elapsed = elapsed;
            }

            public int getCpu_usage() {
                return cpu_usage;
            }

            public void setCpu_usage(int cpu_usage) {
                this.cpu_usage = cpu_usage;
            }

            public String getConsole() {
                return console;
            }

            public void setConsole(String console) {
                this.console = console;
            }

            public int getTotal_cpu_usage() {
                return total_cpu_usage;
            }

            public void setTotal_cpu_usage(int total_cpu_usage) {
                this.total_cpu_usage = total_cpu_usage;
            }

            public String getTrx_id() {
                return trx_id;
            }

            public void setTrx_id(String trx_id) {
                this.trx_id = trx_id;
            }

            public List<?> getInline_traces() {
                return inline_traces;
            }

            public void setInline_traces(List<?> inline_traces) {
                this.inline_traces = inline_traces;
            }

            public static class ReceiptBean {
                /**
                 * receiver : zebra
                 * act_digest : f9225717bb1913274d5fcc0395c59da1c8b4c0dca27c1c791f761b28878ef2bc
                 * global_sequence : 25049
                 * recv_sequence : 36
                 * auth_sequence : [["q",60]]
                 * code_sequence : 1
                 * abi_sequence : 1
                 */

                private String receiver;
                private String act_digest;
                private int global_sequence;
                private int recv_sequence;
                private int code_sequence;
                private int abi_sequence;
                private List<List<String>> auth_sequence;

                public String getReceiver() {
                    return receiver;
                }

                public void setReceiver(String receiver) {
                    this.receiver = receiver;
                }

                public String getAct_digest() {
                    return act_digest;
                }

                public void setAct_digest(String act_digest) {
                    this.act_digest = act_digest;
                }

                public int getGlobal_sequence() {
                    return global_sequence;
                }

                public void setGlobal_sequence(int global_sequence) {
                    this.global_sequence = global_sequence;
                }

                public int getRecv_sequence() {
                    return recv_sequence;
                }

                public void setRecv_sequence(int recv_sequence) {
                    this.recv_sequence = recv_sequence;
                }

                public int getCode_sequence() {
                    return code_sequence;
                }

                public void setCode_sequence(int code_sequence) {
                    this.code_sequence = code_sequence;
                }

                public int getAbi_sequence() {
                    return abi_sequence;
                }

                public void setAbi_sequence(int abi_sequence) {
                    this.abi_sequence = abi_sequence;
                }

                public List<List<String>> getAuth_sequence() {
                    return auth_sequence;
                }

                public void setAuth_sequence(List<List<String>> auth_sequence) {
                    this.auth_sequence = auth_sequence;
                }
            }

            public static class ActBean {
                /**
                 * account : eosio.token
                 * name : transfer
                 * authorization : [{"actor":"q","permission":"active"}]
                 * data : {"from":"q","to":"zebra","quantity":"1.0000 OOO","memo":"memo"}
                 * hex_data : 00000000000000b00000000000738ffa1027000000000000044f4f4f00000000046d656d6f
                 */

                private String account;
                private String name;
                private JsonObject data;
                private String hex_data;
                private List<AuthorizationBean> authorization;

                public String getAccount() {
                    return account;
                }

                public void setAccount(String account) {
                    this.account = account;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public JsonObject getData() {
                    return data;
                }

                public void setData(JsonObject data) {
                    this.data = data;
                }

                public String getHex_data() {
                    return hex_data;
                }

                public void setHex_data(String hex_data) {
                    this.hex_data = hex_data;
                }

                public List<AuthorizationBean> getAuthorization() {
                    return authorization;
                }

                public void setAuthorization(List<AuthorizationBean> authorization) {
                    this.authorization = authorization;
                }

                public static class DataBean {
                    /**
                     * from : q
                     * to : zebra
                     * quantity : 1.0000 OOO
                     * memo : memo
                     */

                    private String from;
                    private String to;
                    private String quantity;
                    private String memo;

                    public String getFrom() {
                        return from;
                    }

                    public void setFrom(String from) {
                        this.from = from;
                    }

                    public String getTo() {
                        return to;
                    }

                    public void setTo(String to) {
                        this.to = to;
                    }

                    public String getQuantity() {
                        return quantity;
                    }

                    public void setQuantity(String quantity) {
                        this.quantity = quantity;
                    }

                    public String getMemo() {
                        return memo;
                    }

                    public void setMemo(String memo) {
                        this.memo = memo;
                    }
                }

                public static class AuthorizationBean {
                    /**
                     * actor : q
                     * permission : active
                     */

                    private String actor;
                    private String permission;

                    public String getActor() {
                        return actor;
                    }

                    public void setActor(String actor) {
                        this.actor = actor;
                    }

                    public String getPermission() {
                        return permission;
                    }

                    public void setPermission(String permission) {
                        this.permission = permission;
                    }
                }
            }
        }
    }
}
